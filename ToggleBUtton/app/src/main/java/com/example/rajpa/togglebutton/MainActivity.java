package com.example.rajpa.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private ToggleButton toggleButton1,toggleButton2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        button        = (Button) findViewById(R.id.btnDesplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer = new StringBuffer();
                buffer.append("toggleButton1 :- ").append(toggleButton1.getText());
                buffer.append("\ntoggleButton2 :- ").append(toggleButton2.getText());

                Toast.makeText(MainActivity.this,buffer.toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
