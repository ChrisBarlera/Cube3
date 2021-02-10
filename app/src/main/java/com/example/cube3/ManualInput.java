package com.example.cube3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManualInput extends AppCompatActivity {
    public Button white_bt;
    public Button green_bt;
    public Button red_bt;
    public Button blue_bt;
    public Button orange_bt;
    public Button yellow_bt;

    public ColorStateList btsColors;
    public TextView txt;

    public String cubeString = "wwwwggggrrrrbbbbooooyyyy";
    public String before;
    public String after;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_input);

        white_bt = findViewById(R.id.whiteButton);
        green_bt = findViewById(R.id.greenButton);
        red_bt = findViewById(R.id.redButton);
        blue_bt = findViewById(R.id.blueButton);
        orange_bt = findViewById(R.id.orangeButton);
        yellow_bt = findViewById(R.id.yellowButton);
        txt = findViewById(R.id.textView);


        white_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teste(white_bt);
            }
        });

        green_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teste(green_bt);
            }
        });

        red_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teste(red_bt);
            }
        });

        blue_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teste(blue_bt);
            }
        });

        orange_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teste(orange_bt);
            }
        });

        yellow_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teste(yellow_bt);
            }
        });
    }


    public void cubePieceClick (View botao) {
        botao.setBackgroundColor(txt.getCurrentTextColor());
        int pos = getPiecePos(botao);
        char colorChar = checkWhichColor(botao);

        before = cubeString.substring(0, pos);
        after = cubeString.substring(pos + 1, cubeString.length());
        cubeString = before + colorChar + after;

        System.out.println(cubeString);
    }

    public int getPiecePos (View botao) {
        String idbotao = botao.getResources().getResourceEntryName(botao.getId());
        String posString = idbotao.substring(2, idbotao.length());
        return Integer.parseInt(posString);
    }

    public char checkWhichColor(View botao){
        int corBotao = ((ColorDrawable)botao.getBackground()).getColor();

        char colorChar = 'c';
        int whiteColorValue = getResources().getColor(R.color.white);
        int greenColorValue = getResources().getColor(R.color.green);
        int redColorValue = getResources().getColor(R.color.red);
        int blueColorValue = getResources().getColor(R.color.blue);
        int orangeColorValue = getResources().getColor(R.color.orange);
        int yellowColorValue = getResources().getColor(R.color.yellow);

        if (corBotao == whiteColorValue){
            colorChar = 'w';
        }
        if (corBotao == greenColorValue){
            colorChar = 'g';
        }
        if (corBotao == redColorValue){
            colorChar = 'r';
        }
        if (corBotao == blueColorValue){
            colorChar = 'b';
        }
        if (corBotao == orangeColorValue){
            colorChar = 'o';
        }
        if (corBotao == yellowColorValue){
            colorChar = 'y';
        }
        return colorChar;
    }

    public void teste(Button butao){
        btsColors = butao.getTextColors();
        txt.setTextColor(btsColors);
    }

    public void okButtonClick(View view){
        Intent intent = new Intent(this, Solve1.class);
        Bundle bundleCubeString = new Bundle();
        bundleCubeString.putString("id_cubestring", getCubeString());

        intent.putExtras(bundleCubeString);
        startActivity(intent);

        System.out.println(getCubeString());
    }

    public String getCubeString(){
        return cubeString;
    }
}
