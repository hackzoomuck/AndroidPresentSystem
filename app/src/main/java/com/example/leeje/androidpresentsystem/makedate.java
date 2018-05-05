package com.example.leeje.androidpresentsystem;

/**
 * Created by leeje on 2018-05-03.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class makedate extends  Activity {

    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_makepromise_data);

        CalendarView calender = (CalendarView) findViewById(R.id.calendar);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

                // TODO Auto-generated method stub

                Toast.makeText(makedate.this, "" + year + "/" + (month + 1) + "/" + dayOfMonth,Toast.LENGTH_SHORT).show();

            }

        });


    }

}
