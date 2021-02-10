package com.example.cube3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Solve2 extends AppCompatActivity {

    public TextView ollHelp;
    public TextView ollAlg;

    String cubeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve2);
        Bundle bundle = getIntent().getExtras();
        cubeString = bundle.getString("id_cubestring");
        ollHelp = findViewById(R.id.ollHelp);
        ollAlg = findViewById(R.id.ollAlg);
    }

    public void ollBtClick (View v) {
        Movements stuff = new Movements();
        System.out.println("CUBE ANTES: " + cubeString);
        String alg = stuff.getOllAlg(cubeString);
        cubeString = stuff.AlgToCube(alg, cubeString);
        ollHelp.setText(stuff.findCubeDown(cubeString));
        ollAlg.setText(alg);

        System.out.println("CUBE AFTER: " + cubeString);
    }

    public void toPLL (View v) {
        Bundle bundle = new Bundle();
        bundle.putString("id_cubestring", cubeString);
        Intent intent = new Intent(this, Solve3.class);

        intent.putExtras(bundle);
        startActivity(intent);
    }

}
