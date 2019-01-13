package com.example.alisa.starterhacks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by Alisa on 2019-01-13.
 */

public class MoodTracker extends AppCompatActivity implements View.OnClickListener{




        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.sadButtonId:
                    holder.text1.setTextColor(Color.RED);
                    break;
                case R.id.happyButtonId:
                    holder.text1.setTextColor(Color.RED);
                    break;



            }
        }


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_main);

        TextView text1 = (TextView) findViewById(R.id.text1);



        ImageButton sadButton = (ImageButton) findViewById(R.id.sadButtonId);
        sadButton.setOnClickListener(this);

        ImageButton happyButton = (ImageButton) findViewById(R.id.happyButtonId);
        happyButton.setOnClickListener(this);



    }
}
