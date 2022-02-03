package com.company;

public class Main {

    public static void main(String[] args) {
        Iphone eleven = new Iphone(3,Color.WHITE,93);
        eleven.kamera("Включить вспышка",4);
        System.out.println(eleven.Info());
        System.out.println("-----------------------------------------");

        IphoneXs IphoneXr = new IphoneXs(2,Color.BLACK,96,24000);
        IphoneXr.kamera("Выключить вспышка", 2);
        System.out.println(IphoneXr.Info());
        System.out.println("------------------------------------------");

        IphoneXs IphoneX = new IphoneXs(3,Color.RED,100,22000);
        IphoneX.kamera("ключить вспышка",3);
        System.out.println(IphoneX.Info());


    }

}

