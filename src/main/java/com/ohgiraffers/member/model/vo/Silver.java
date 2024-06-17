package com.ohgiraffers.member.model.vo;

public class Silver extends Member implements Buyable {

    public Silver(String name, String grade, int point) {

        super(name, grade, point);

    }

    @Override
    public double calculateInterest(int point) {
        return point*0.02;
    }


    public double buy (int price) {

        return buy(price);

    }



}
