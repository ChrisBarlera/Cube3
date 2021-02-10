package com.example.cube3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Solve3 extends AppCompatActivity {
    String cubeString = " ";
    String pllAlg;
    TextView txtPLL = findViewById(R.id.textView3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve3);

        Bundle bundle = getIntent().getExtras();
        cubeString = bundle.getString("id_cubestring");

        Movements stuff = new Movements();
        String cubeDown = stuff.findCubeDown(cubeString);
        String cubeUp = stuff.findCubeUp(cubeString);
//        String cubeMeio = stuff.findMeio(cubeString);
        String cubeFront = stuff.findCubeFront(cubeString);
        String cubeRight = stuff.findCubeRight(cubeString);
        String cubeBack = stuff.findCubeBack(cubeString);
        String cubeLeft = stuff.findCubeLeft(cubeString);

        pllAlg = stuff.getPllAlg(cubeFront, cubeRight, cubeBack, cubeLeft);
        cubeString = stuff.AlgToCube(pllAlg, cubeString);


    }

    public void pllclick(View v){
        txtPLL.setText(pllAlg);
    }
}