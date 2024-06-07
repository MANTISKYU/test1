package com.ohgiraffers.member.model.vo;

public class Vip extends Member implements Buyable{

    public Vip(String name, String grade, int point) {

        super(name, grade, point);



    }

    public double calculateInterest () {

        return this.getPoint()*0.1;

    }

    public int buy (int price) {

        return buy(price);

    }


}
