package com.example.testservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startService = findViewById(R.id.bt_start_service);
        Button stopService = findViewById(R.id.bt_stop_service);
        startService.setOnClickListener(OnClickListener);
        stopService.setOnClickListener(OnClickListener);
    }
    View.OnClickListener OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),SimpleService.class);
            switch (v.getId()){
                case R.id.bt_start_service:
                    startService(intent);
                    break;
                case R.id.bt_stop_service:
                    stopService(intent);
                    break;
            }
        }
    };
}
