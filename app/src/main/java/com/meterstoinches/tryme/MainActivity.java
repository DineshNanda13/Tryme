package com.meterstoinches.tryme;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View bg;
    private Button trymebtn;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLUE,
        Color.DKGRAY, Color.LTGRAY, Color.MAGENTA, Color.YELLOW};

        trymebtn = (Button) findViewById(R.id.try_meBtnID);
        bg = findViewById(R.id.background_ID);
        //bg.setBackgroundColor(colors[1]);

        trymebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);
                bg.setBackgroundColor(colors[randomNum]);
                trymebtn.setBackgroundColor(colors[randomNum]);
                Log.d("random number", String.valueOf(randomNum));
            }
        });
    }
}
