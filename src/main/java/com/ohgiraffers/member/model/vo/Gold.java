package com.ohgiraffers.member.model.vo;



public class Gold extends Member implements Buyable {



    public Gold(String name, String grade, int point) {

        super(name, grade, point);



    }

    public Gold() {
    }

    public double calculateInterest () {

        return this.getPoint()*0.05;

    }

    public int buy (int price) {

        return buy(price);

    }

}
