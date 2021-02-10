package com.example.cube3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button manual_bt;
    Button camera_bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manual_bt = findViewById(R.id.manualbt);
        camera_bt = findViewById(R.id.camerabt);


    }

    public void openManualActivity(View v){
        Intent intent = new Intent(this, ManualInput.class);
        startActivity(intent);
    }
}
