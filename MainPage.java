package com.example.alisa.starterhacks;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Alisa on 2019-01-12.
 */

public class MainPage extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.medicationButtonId:
                startActivity(new Intent(MainPage.this, Medication.class));
                break;
            case R.id.doctorButtonId:
                startActivity(new Intent(MainPage.this, Doctor.class));
                break;
            case R.id.moodTrackerButtonId:
                startActivity(new Intent(MainPage.this, MoodTracker.class));
                break;


        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_main);


        Button medicationButton = (Button) findViewById(R.id.medicationButtonId);
        medicationButton.setOnClickListener(this);

        Button doctorButton = (Button) findViewById(R.id.doctorButtonId);
        doctorButton.setOnClickListener(this);

        Button moodTrackerButton = (Button) findViewById(R.id.moodTrackerButtonId);
        moodTrackerButton.setOnClickListener(this);

//        Button medicationButton = (Button) findViewById(R.id.medicationButtonId);
//
//        medicationButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainPage.this, Medication.class));
//            }
//        });
//
//        Button moodTrackerButton = (Button) findViewById(R.id.moodTrackerButtonId);
//
//        moodTrackerButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainPage.this, MoodTracker.class));
//            }
//        });
//
//
//        Button doctorButton = (Button) findViewById(R.id.doctorButtonId);
//
//        doctorButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainPage.this, Doctor.class));
//            }
//        });





//        medicationButton = (Button)findViewById(R.id.medicationButtonId);
//        medicationButton.setOnClickListener(this);


//        TextView Hello = (TextView)findViewById(R.id.Hello);
//        Hello.setText("Hello");


    }




}
