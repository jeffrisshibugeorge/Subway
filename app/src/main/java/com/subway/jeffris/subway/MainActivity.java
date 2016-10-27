package com.subway.jeffris.subway;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton rb1=(RadioButton) findViewById(R.id.radioButton);
        final RadioButton rb2=(RadioButton) findViewById(R.id.radioButton2);

        final Button btnGo=(Button)findViewById(R.id.button);

        btnGo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(rb1.isChecked())
                        {
                            Intent intent=new Intent(getApplicationContext(), Veg.class
                            );
                            startActivity(intent);
                        }
                    }
                }
        );

    }




    }




