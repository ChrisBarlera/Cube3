package com.example.cube3;

import android.webkit.WebView;

import org.jetbrains.annotations.NotNull;

public class Movements {
    Constants cnst;

    Movements(){
        this.cnst = new Constants();
    }

//    public String findMeio(String cube){
//        String meio = "";
//        if (cubeDownPos(cube) == 0 || cubeDownPos(cube) == 20) {
//            meio = cube.substring(4, cube.length() - 4);
//        }
//        if (cubeDownPos(cube) == 4 || cubeDownPos(cube) == 12){
//            String antes = cube.substring(0 , 4);
//            String aux = cube.substring(8,12);
//            String depois = cube.substring(16,24);
//            meio = antes + aux + depois;
//        }
//        if (cubeDownPos(cube) == 8 || cubeDownPos(cube) == 16){
//            String antes = cube.substring(0 , 8);
//            String aux = cube.substring(12,16);
//            String depois = cube.substring(20,24);
//            meio = antes + aux + depois;
//        }
//
//        return meio;
//    }
//    public int cubeDownPos(String cube) {
//        int cubeDown = 99;
//
//        for (int i = 0; i < cube.length(); i++) {
//            if (cube.charAt(i) == 'w' && cube.charAt(i + 1) == 'w' &&
//                    cube.charAt(i + 2) == 'w' && cube.charAt(i + 3) == 'w'){
//                cubeDown = i;
//            }
//        }
//        return cubeDown;
//    }
//
//
//    public String findCubeUp(String cube){
//        String cubeUp = "??? cubeup";
//        for (int i = 0; i < cube.length(); i++){
//            if (cube.charAt(i) == 'w' && cube.charAt(i + 1) == 'w' &&
//                    cube.charAt(i + 2) == 'w' && cube.charAt(i + 3) == 'w'){
//
//                if (i == 0){
//                    cubeUp = cube.substring(20, cube.length());
//                }
//                if (i == 4){
//                    cubeUp = cube.substring(12, 16);
//                }
//                if (i == 8){
//                    cubeUp = cube.substring(16, 20);
//                }
//                if (i == 12){
//                    cubeUp = cube.substring(4, 8);
//                }
//                if (i == 16){
//                    cubeUp = cube.substring(8, 12);
//                }
//                if (i == 20){
//                    cubeUp = cube.substring(0, 4);
//                }
//            }
//        }
//        return cubeUp;
//    }
//    public String findCubeDown(String cube) {
//        String cubeDown = "";
//
//        for (int i = 0; i < cube.length(); i++) {
//            if (cube.charAt(i) == 'w' && cube.charAt(i + 1) == 'w' &&
//                    cube.charAt(i + 2) == 'w' && cube.charAt(i + 3) == 'w'){
//                cubeDown = cube.substring(i, i + 4);
//            }
//        }
//        return cubeDown;
//    }
//    public String findCubeFront(String meio){
//        return meio.substring(0,4);
//    }
//    public String findCubeRight(String meio){
//        return meio.substring(4,8);
//    }
//    public String findCubeBack(String meio){
//        return meio.substring(8,12);
//    }
//    public String findCubeLeft(String meio){
//        return meio.substring(12,16);
//    }
    public String findCubeUp(String cube){
        String face = cube.substring(0, 4);
        return face;
    }

    public String findCubeFront(String cube){
        String face = cube.substring(4, 8);
        return face;
    }

    public String findCubeRight(String cube){
        String face = cube.substring(8, 12);
        return face;
    }

    public String findCubeBack(String cube){
        String face = cube.substring(12, 16);
        return face;
    }

    public String findCubeLeft(String cube){
        String face = cube.substring(16, 20);
        return face;
    }

    public String findCubeDown(String cube){
        String face = cube.substring(cube.length() - 4, cube.length());
        return face;
    }

    public String horario90(String face){
        String str;
        String char0 = String.valueOf(face.charAt(0));
        String char1 = String.valueOf(face.charAt(1));
        String char2 = String.valueOf(face.charAt(2));
        String char3 = String.valueOf(face.charAt(3));

        str = char2 + char0 + char3 + char1;

        return str;
    }

    public String antihorario90(String face){
        String str;
        String char0 = String.valueOf(face.charAt(0));
        String char1 = String.valueOf(face.charAt(1));
        String char2 = String.valueOf(face.charAt(2));
        String char3 = String.valueOf(face.charAt(3));

        str = char1 + char3 + char0 + char2;

        return str;
    }

    public String AlgMove(String cube, char c, boolean invertido){
        String newCube = "entrou algmove e nao entrou em nada aqui";
//        String meio = findMeio(cube);
        String front = findCubeFront(cube);
        String right = findCubeRight(cube);
        String back = findCubeBack(cube);
        String left = findCubeLeft(cube);
        String up = findCubeUp(cube);
        String down = findCubeDown(cube);

        if (invertido){
            if (c == 'F'){
                front = antihorario90(front);

                char r0 = right.charAt(0);
                char r2 = right.charAt(2);
                StringBuilder str1 = new StringBuilder(up);
                str1.setCharAt(2, r0);
                str1.setCharAt(3, r2);

                char u2 = up.charAt(2);
                char u3 = up.charAt(3);
                StringBuilder str2 = new StringBuilder(left);
                str2.setCharAt(3, u2);
                str2.setCharAt(1, u3);

                char l1 = left.charAt(1);
                char l3 = left.charAt(3);
                StringBuilder str3 = new StringBuilder(down);
                str3.setCharAt(0, l1);
                str3.setCharAt(1, l3);

                char d0 = down.charAt(0);
                char d1 = down.charAt(1);
                StringBuilder str4 = new StringBuilder(right);
                str4.setCharAt(2, d0);
                str4.setCharAt(0, d1);

                up = str1.toString();
                left = str2.toString();
                down = str3.toString();
                right = str4.toString();
            }
            if (c == 'R'){
                right = antihorario90(right);

                char b0 = back.charAt(0);
                char b2 = back.charAt(2);
                StringBuilder str1 = new StringBuilder(up);
                str1.setCharAt(3, b0);
                str1.setCharAt(1, b2);

                char u1 = up.charAt(1);
                char u3 = up.charAt(3);
                StringBuilder str2 = new StringBuilder(front);
                str2.setCharAt(1, u1);
                str2.setCharAt(3, u3);

                char f1 = front.charAt(1);
                char f3 = front.charAt(3);
                StringBuilder str3 = new StringBuilder(down);
                str3.setCharAt(1, f1);
                str3.setCharAt(3, f3);

                char d1 = down.charAt(1);
                char d3 = down.charAt(3);
                StringBuilder str4 = new StringBuilder(back);
                str4.setCharAt(2, d1);
                str4.setCharAt(0, d3);

                up = str1.toString();
                front = str2.toString();
                down = str3.toString();
                back = str4.toString();
            }
            if (c == 'U'){
                up = antihorario90(up);

                char l0 = left.charAt(0);
                char l1 = left.charAt(1);
                StringBuilder str1 = new StringBuilder(front);
                str1.setCharAt(0, l0);
                str1.setCharAt(1, l1);

                char f0 = front.charAt(0);
                char f1 = front.charAt(1);
                StringBuilder str2 = new StringBuilder(right);
                str2.setCharAt(0, f0);
                str2.setCharAt(1, f1);

                char r0 = right.charAt(0);
                char r1 = right.charAt(1);
                StringBuilder str3 = new StringBuilder(back);
                str3.setCharAt(0, r0);
                str3.setCharAt(1, r1);

                char b0 = back.charAt(0);
                char b1 = back.charAt(1);
                StringBuilder str4 = new StringBuilder(left);
                str4.setCharAt(0, b0);
                str4.setCharAt(1, b1);

                front = str1.toString();
                right = str2.toString();
                back = str3.toString();
                left = str4.toString();
            }
        } else {
            if (c == 'F'){
                front = horario90(front);

                char l1 = left.charAt(1);
                char l3 = left.charAt(3);
                StringBuilder str1 = new StringBuilder(up);
                str1.setCharAt(3, l1);
                str1.setCharAt(2, l3);

                char u2 = up.charAt(2);
                char u3 = up.charAt(3);
                StringBuilder str2 = new StringBuilder(right);
                str2.setCharAt(0, u2);
                str2.setCharAt(2, u3);

                char r0 = right.charAt(0);
                char r2 = right.charAt(2);
                StringBuilder str3 = new StringBuilder(down);
                str3.setCharAt(0, r2);
                str3.setCharAt(1, r0);

                char d0 = down.charAt(0);
                char d1 = down.charAt(1);
                StringBuilder str4 = new StringBuilder(left);
                str4.setCharAt(1, d0);
                str4.setCharAt(3, d1);

                up = str1.toString();
                right = str2.toString();
                down = str3.toString();
                left = str4.toString();
            }
            if (c == 'R'){
                right = horario90(right);

                char b0 = back.charAt(0);
                char b2 = back.charAt(2);
                StringBuilder str1 = new StringBuilder(down);
                str1.setCharAt(3, b0);
                str1.setCharAt(1, b2);

                char d1 = down.charAt(1);
                char d3 = down.charAt(3);
                StringBuilder str2 = new StringBuilder(front);
                str2.setCharAt(1, d1);
                str2.setCharAt(3, d3);

                char f1 = front.charAt(1);
                char f3 = front.charAt(3);
                StringBuilder str3 = new StringBuilder(up);
                str3.setCharAt(1, f1);
                str3.setCharAt(3, f3);

                char u1 = up.charAt(1);
                char u3 = up.charAt(3);
                StringBuilder str4 = new StringBuilder(back);
                str4.setCharAt(2, u1);
                str4.setCharAt(0, u3);

                down = str1.toString();
                front = str2.toString();
                up = str3.toString();
                back = str4.toString();
            }
            if (c == 'U'){
                up = horario90(up);

                char r0 = right.charAt(0);
                char r1 = right.charAt(1);
                StringBuilder str1 = new StringBuilder(front);
                str1.setCharAt(0, r0);
                str1.setCharAt(1, r1);

                char f0 = front.charAt(0);
                char f1 = front.charAt(1);
                StringBuilder str2 = new StringBuilder(left);
                str2.setCharAt(0, f0);
                str2.setCharAt(1, f1);

                char l0 = left.charAt(0);
                char l1 = left.charAt(1);
                StringBuilder str3 = new StringBuilder(back);
                str3.setCharAt(0, l0);
                str3.setCharAt(1, l1);

                char b0 = back.charAt(0);
                char b1 = back.charAt(1);
                StringBuilder str4 = new StringBuilder(right);
                str4.setCharAt(0, b0);
                str4.setCharAt(1, b1);

                front = str1.toString();
                left = str2.toString();
                back = str3.toString();
                right = str4.toString();
            }
        }

        newCube = up + front + right + back + left + down;
        return newCube;
    }
    public String AlgToCube(@NotNull String alg, String cube){
        String newCube = "";
        boolean firstTime = true;

        for (int i = 0; i < alg.length(); i++) {
            if (firstTime){
                if (alg.charAt(i) == ' '){
                    if (alg.charAt(i - 1) == '2') {
                        newCube = AlgMove(cube, alg.charAt(i - 2), false);
                        newCube = AlgMove(newCube, alg.charAt(i - 2), false);
                        firstTime = false;
                    } else {
                        if (alg.charAt(i - 1) == 'F' || alg.charAt(i - 1) == 'R' || alg.charAt(i - 1) == 'U'){
                            newCube = AlgMove(cube, alg.charAt(i - 1), false);
                            firstTime = false;
                        } else {
                            newCube = AlgMove(cube, alg.charAt(i - 2), true);
                            firstTime = false;
                        }
                    }

                }
            } else {
                if (alg.charAt(i) == ' '){
                    if (alg.charAt(i - 1) == '2') {
                        newCube = AlgMove(newCube, alg.charAt(i - 2), false);
                        newCube = AlgMove(newCube, alg.charAt(i - 2), false);
                        firstTime = false;
                    } else {
                        if (alg.charAt(i - 1) == 'F' || alg.charAt(i - 1) == 'R' || alg.charAt(i - 1) == 'U'){
                            newCube = AlgMove(newCube, alg.charAt(i - 1), false);
                        } else {
                            newCube = AlgMove(newCube, alg.charAt(i - 2), true);
                        }
                    }

                }
            }
        }

        return newCube;
    }

    public String getOllAlg(String cube){
        int yellowcount = 0;
        String returnString = "Erro na inserção, volte e tente de novo :(";
//        String cubeMeio = findMeio(cube);
        String cubeUp = findCubeDown(cube);
        String cubeLEFT = findCubeLeft(cube);
        String cubeRIGHT = findCubeRight(cube);
        String cubeFRONT = findCubeFront(cube);
        String cubeBACK = findCubeBack(cube);

        for (int i = 0; i < cubeUp.length(); i++){
            if (cubeUp.charAt(i) == 'y'){
                yellowcount++;
                System.out.println(yellowcount);
            }
        }

        if (yellowcount == 0) {
            ////NONE E DUPLAS////
            if (isTwoPiecesFace(cubeFRONT) && isTwoPiecesFace(cubeBACK)){
                returnString = cnst.duplas;

            } else {
                if (isTwoPiecesFace(cubeLEFT) && isTwoPiecesFace(cubeRIGHT)){
                    returnString = cnst.duplas;
                } else {
                    returnString = cnst.none;
                }
            }
        }

        if (yellowcount == 1){
            if (cubeLEFT.charAt(2) == 'y' && cubeRIGHT.charAt(2) == 'y' &&
                    cubeFRONT.charAt(2) == 'y' && cubeBACK.charAt(2) == 'y'){
                returnString = cnst.upLeft;
            } else {
                returnString = cnst.upRight;
            }
        }

        if (yellowcount == 2){
            if (cubeUp.charAt(0) == 'y'&& cubeUp.charAt(3) == 'y' ||
                    cubeUp.charAt(1) == 'y'&& cubeUp.charAt(2) == 'y'){
                returnString = this.cnst.everyone;
            }
            /////////////STAIRS/////////////
            String yellowPositions = "";
            String stairsOpposite = "";
            int opposYlwCount = 0;
            for (int i = 0; i < cubeUp.length(); i++){
                if (cubeUp.charAt(i) == 'y'){
                    yellowPositions = yellowPositions + i;
                }
            }
            System.out.println("positions: " + yellowPositions);
            if (yellowPositions.equals("23")){
                stairsOpposite = cube.substring(4, 8);
            }
            if (yellowPositions.equals("02")){
                stairsOpposite = cube.substring(8, 12);

            }
            if (yellowPositions.equals("01")){
                stairsOpposite = cube.substring(12, 16);
            }
            if (yellowPositions.equals("13")){
                stairsOpposite = cube.substring(16, 20);
            }



            for (int i = 0; i < stairsOpposite.length(); i++){
                if (stairsOpposite.charAt(i) == 'y'){
                    opposYlwCount++;
                }
            }
            System.out.println("oppos: " + stairsOpposite);
            System.out.println("oppos count: " + opposYlwCount);

            if (opposYlwCount == 0){
                returnString = cnst.wrongStairs;
            } else {
                returnString = cnst.rightStairs;
            }
            //////////////////////////////
        }

        if (yellowcount == 4){
            returnString = "Clique em next";
        }
        return returnString;
    }
    public String getOllNewCube(String cube){
        int yellowcount = 0;
        String returnString = "Erro na inserção, volte e tente de novo :(";
//        String cubeMeio = findMeio(cube);
        String cubeUp = findCubeDown(cube);
        String cubeLEFT = findCubeLeft(cube);
        String cubeRIGHT = findCubeRight(cube);
        String cubeFRONT = findCubeFront(cube);
        String cubeBACK = findCubeBack(cube);

        for (int i = 0; i < cubeUp.length(); i++){
            if (cubeUp.charAt(i) == 'y'){
                yellowcount++;
                System.out.println(yellowcount);
            }
        }

        if (yellowcount == 0) {
            ////NONE E DUPLAS////
            if (isTwoPiecesFace(cubeFRONT) && isTwoPiecesFace(cubeBACK)){
                returnString = cnst.duplas;

            } else {
                if (isTwoPiecesFace(cubeLEFT) && isTwoPiecesFace(cubeRIGHT)){
                    returnString = cnst.duplas;
                } else {
                    returnString = cnst.none;
                }
            }
        }

        if (yellowcount == 1){
            if (cubeLEFT.charAt(2) == 'y' && cubeRIGHT.charAt(2) == 'y' &&
                    cubeFRONT.charAt(2) == 'y' && cubeBACK.charAt(2) == 'y'){
                returnString = cnst.upLeft;
            } else {
                returnString = cnst.upRight;
            }
        }

        if (yellowcount == 2){
            if (cubeUp.charAt(0) == 'y'&& cubeUp.charAt(3) == 'y' ||
                    cubeUp.charAt(1) == 'y'&& cubeUp.charAt(2) == 'y'){
                returnString = this.cnst.everyone;
            }
            /////////////STAIRS/////////////
            String yellowPositions = "";
            String stairsOpposite = "";
            int opposYlwCount = 0;
            for (int i = 0; i < cubeUp.length(); i++){
                if (cubeUp.charAt(i) == 'y'){
                    yellowPositions = yellowPositions + i;
                }
            }
            System.out.println("positions: " + yellowPositions);
            if (yellowPositions.equals("23")){
                stairsOpposite = cube.substring(4, 8);
            }
            if (yellowPositions.equals("02")){
                stairsOpposite = cube.substring(8, 12);

            }
            if (yellowPositions.equals("01")){
                stairsOpposite = cube.substring(12, 16);
            }
            if (yellowPositions.equals("13")){
                stairsOpposite = cube.substring(16, 20);
            }



            for (int i = 0; i < stairsOpposite.length(); i++){
                if (stairsOpposite.charAt(i) == 'y'){
                    opposYlwCount++;
                }
            }
            System.out.println("oppos: " + stairsOpposite);
            System.out.println("oppos count: " + opposYlwCount);

            if (opposYlwCount == 0){
                returnString = cnst.wrongStairs;
            } else {
                returnString = cnst.rightStairs;
            }
            //////////////////////////////
        }

        if (yellowcount == 4){
            returnString = "Clique em next";
        }
        return returnString;
    }


    public boolean isTwoPiecesFace(String face){
        System.out.println(face);

        int yellowcount = 0;
        for (int i = 0; i < face.length(); i++) {
            if (face.charAt(i) == 'y'){
                yellowcount++;
            }
        }
        if (yellowcount == 2) {
            if (face.charAt(0) == face.charAt(3) || face.charAt(1) == face.charAt(2)){
                System.out.println("Two pieces false");
                return false;
            } else {
                System.out.println("Two pieces true");
                return true;
            }
        } else {
            return false;
        }

    }

    public String getPllAlg(String front, String right, String back, String left){
        String alg = cnst.pllcruzado;
        if (isTwoPiecesFace(front) || isTwoPiecesFace(right) ||
                isTwoPiecesFace(back) || isTwoPiecesFace(left)){
            alg = cnst.plljuntas;
        }
        return alg;
    }
}