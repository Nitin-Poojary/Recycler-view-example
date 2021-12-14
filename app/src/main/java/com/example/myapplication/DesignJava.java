package com.example.myapplication;

class DesignJava {
    private String text1, text2;
    private int images;

    public DesignJava(String text1, String text2, int images) {
        this.text1 = text1;
        this.text2 = text2;
        this.images = images;
    }

    public String getText1(){return text1;}

    public String getText2(){return text2;}

    public int getImage(){return images;}
}
