package com.ohgiraffers.member.model.vo;

public class Vip extends Member implements Buyable{

    public Vip(String name, String grade, int point) {

        super(name, grade, point);



    }

    @Override
    public double calculateInterest(int point) {
        return point*0.1;
    }

    public double buy (int price) {

        return buy(price);

    }


}
