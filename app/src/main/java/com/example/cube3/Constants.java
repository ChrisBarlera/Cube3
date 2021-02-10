package com.example.cube3;

public class Constants {
    ////////////// OLL ///////////////
    String everyone = "R U R U' R' F R' F' "; // ???????????? //count = 2//help = diagonal amarela baixo pra cima sem peça amarela na frente, amarela direita
    String rightStairs = "F R U R' U' F' "; // OOOOOOOOOOOOOOOO //count = 2 //help = linha vertical na direita
    String wrongStairs = "R U R' U' R' F R F' ";//OOOOOOOOOOOO //count = 2 //help = linha vertical na direita //
    String upLeft = "R U R' U R U2 R' "; // OOOOOOOO //count = 1 //help = peça amarela na esquerda inferior
    String upRight = "U' R U2 R' U' R U' R' "; // OOOOOOOOOOOO //count = 1 //help = peça amarela na direita inferior
    String none = "F R U R' U' R U R' U' F' "; //OOOOOOOOOO //count = 0 //help = linha na esquerda
    String duplas = "R2 U2 R U2 R2 ";//OOOOOOOOOOOOOO //count = 0 //help = deixe as amarelas opostas, duas na frente e duas atras

    /////////////// PLL ///////////////
    String plljuntas = "R U2 R' U' R U2 R' F R' F' R "; //HELP = peças jumtas na esquerda;
    String pllcruzado = "R U' R' U' F2 U' R U R' U F2 "; //help = diagonal errada cima pra baixo esquerda pra direita
}
