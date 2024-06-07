package com.ohgiraffers.member.model.vo;

public class Silver extends Member implements Buyable {

    public Silver(String name, String grade, int point) {

        super(name, grade, point);

    }

    public double calculateInterest () {

        return this.getPoint()*0.02;

    }

    public int buy (int price) {

        return buy(price);

    }



}
