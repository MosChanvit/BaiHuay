package com.example.baihuay;




public class Huay {
    public String getRandomTwoDigits(){
        int random1 = (int)(Math.random()*10);
        int random2 = (int)(Math.random()*10);
        String  num = random1+""+random2;
        return num;
    }
    public String getRandomThreeDigits(){
        int random1 = (int)(Math.random()*10);
        int random2 = (int)(Math.random()*10);
        int random3 = (int)(Math.random()*10);
        String  num = random1+""+random2+""+random3;
        return num;
    }
}
