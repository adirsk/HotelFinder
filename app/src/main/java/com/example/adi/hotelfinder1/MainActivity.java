package com.example.adi.hotelfinder1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public Button btnMap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener listener =new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent i= new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(i);
            }
        };
        btnMap =(Button)findViewById(R.id.btnMap);
        btnMap.setOnClickListener(listener);
    }
}


