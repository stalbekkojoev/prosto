package com.company;

public class Iphone extends Phone{
    private int capacity;

    public Iphone(int gabarit, Color color, int capacity) {
        super(gabarit, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void kamera (String kamera) {
        System.out.println(kamera);
    }

    public final void kamera (String kamera, int call){
        for (int i = 0; i < call; i++) {
            System.out.println(kamera);
        }
    }

    public String Info (){
        return "Габарит:"+getGabarit()+
                "\nЕмкость:"+capacity;
    }
}
