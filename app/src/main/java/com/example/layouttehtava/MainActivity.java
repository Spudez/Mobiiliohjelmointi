package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    int tila = 0;


    public void shortclick()
    {
        Toast.makeText(this, "Only long click allowed", Toast.LENGTH_LONG).show();

    }


    public void longclick()
    {
        final ImageView imgView = findViewById(R.id.picture1);
        imgView.setVisibility(View.VISIBLE);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        final ImageView imgView = findViewById(R.id.picture1);




        if (tila == 0) {
            button2.setEnabled(false);
            button3.setEnabled(false);
        }


        this.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tila == 0) {
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    tila = 1;
                }
                else{

                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    tila = 0;
                }

            }
        });

        this.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    imgView.setVisibility(View.INVISIBLE);

            }
        });

        this.button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shortclick();
            }
        });

        this.button2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                longclick();
                return true;
            }
        });


    }
}
