package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MyApplication ma = (MyApplication)getApplication();
        ma.setName("MaoMaoChong");
        System.out.println(ma.getName());
    }

    public void onClickAddName(View view){
        ContentValues values = new ContentValues();
        values.put(StudentProvider.NAME,((EditText)findViewById(R.id.et_name)).getText().toString().trim());
        values.put(StudentProvider.GRADE,((EditText)findViewById(R.id.et_grade)).getText().toString().trim());
        Uri uri = getContentResolver().insert(StudentProvider.CONTENT_URI,values);
        Toast.makeText(getBaseContext(),uri.toString(),Toast.LENGTH_SHORT).show();
    }

    public void onClickRetrieStudents(View view){
        String URL = "content://com.example.provider.Collage/students";
        Uri students = Uri.parse(URL);
        Cursor c = managedQuery(students,null,null,null,"name");

        if (c.moveToFirst()){
            do {
//                Toast.makeText(this,
//                        c.getString(c.getColumnIndex(StudentProvider._ID))+
//                        ","+c.getString(c.getColumnIndex(StudentProvider.NAME))+
//                        ","+c.getString(c.getColumnIndex(StudentProvider.GRADE)),
//                        Toast.LENGTH_SHORT).show();
                System.out.println(
                        c.getString(c.getColumnIndex(StudentProvider._ID))+
                        ","+c.getString(c.getColumnIndex(StudentProvider.NAME))+
                        ","+c.getString(c.getColumnIndex(StudentProvider.GRADE)));
            }while (c.moveToNext());
        }
    }
}
