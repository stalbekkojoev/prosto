package com.company;

public final class IphoneXs extends Iphone{
    private int sum;

    public IphoneXs(int gabarit, Color color, int capacity, int sum) {
        super(gabarit, color, capacity);
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public String Info (){
        return "Габарит:"+getGabarit()+
                "\nЕмкость:"+ getCapacity()+
                "\nСумма:"+sum;
    }
}
