package com.example.cube3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Solve1 extends AppCompatActivity {

    public String cubeString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve1);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            this.cubeString = bundle.getString("id_cubestring");
        }
    }

    public void goNext(View v) {
        System.out.println(this.cubeString);

        Bundle bundle = new Bundle();
        bundle.putString("id_cubestring", this.cubeString);
        Intent intent = new Intent(this, Solve2.class);

        intent.putExtras(bundle);
        startActivity(intent);
    }

}