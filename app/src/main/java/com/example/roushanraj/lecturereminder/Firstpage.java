package com.example.roushanraj.lecturereminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
    }
    public void edit(View v)
    {
        Intent  i= new Intent(Firstpage.this,EditPanel.class);
        startActivity(i);
    }
}
