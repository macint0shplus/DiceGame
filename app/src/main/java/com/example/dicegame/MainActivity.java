package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private ImageView coinImage;
    private Button rollButton;

    private ImageView dicePic1;
    private ImageView dicePic2;

    private TextView d1Result;
    private TextView d2Result;
    private TextView dSum;

    private TextView d1ResultTV;
    private TextView d2ResultTV;
    private TextView dSumTV;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        rollButton = findViewById(R.id.rollButton);
        dicePic1 = findViewById(R.id.dicePic1);
        dicePic2 = findViewById(R.id.dicePic2);
        d1Result = findViewById(R.id.d1Result);
        d2Result = findViewById(R.id.d2Result);
        dSum = findViewById(R.id.dSum);
        d1ResultTV = findViewById(R.id.d1ResultTV);
        d2ResultTV = findViewById(R.id.d2ResultTV);
        dSumTV = findViewById(R.id.dSumTV);




        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) { // If you click on the Button
                rollDice(); // The function it leads to
            }
        });
    }

    public void rollDice(){
        int roll1 = (int)Math.floor((Math.random() * 6 ) + 1);
        int roll2 = (int)Math.floor((Math.random() * 6 ) + 1);
        int total = roll1 + roll2;

        d1ResultTV.setText(Integer.toString(roll1));
        d2ResultTV.setText(Integer.toString(roll2));
        dSumTV.setText(Integer.toString(total));

    };

}
