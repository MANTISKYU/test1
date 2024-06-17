package com.ohgiraffers.member.model.vo;



public class Gold extends Member implements Buyable {



    public Gold(String name, String grade, int point) {

        super(name, grade, point);



    }

    @Override
    public double calculateInterest(int point) {
        return point*0.05;
    }

    public Gold() {
    }


    public double buy (int price) {

        return buy(price);

    }

}
