package com.example.roushanraj.lecturereminder;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;
public class EditPanel extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_panel);
    }
    public void time1(View v)
    {

        final Calendar c= Calendar.getInstance();
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);

        t1=(TextView)findViewById(R.id.time1);
        TimePickerDialog tp1=new TimePickerDialog(EditPanel.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay,int minute) {
                t1.setText(hourOfDay+":"+minute);
            }
        },hour,minute,false);
        tp1.show();


    }
}
