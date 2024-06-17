package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.vo.Member;
import java.util.ArrayList;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

public class MemberRepository {


    List<Member> memberList = new ArrayList<>();


    public void printData() {

        for(Member m : memberList ) {

            System.out.println(m.getGrade() + "등급 회원 " + m.getName() + "의 포인트는 " + m.getPoint() + "이고, 이자 포인트는"
                    + m.calculateInterest(m.getPoint()) + "입니다");

        }
    }


    public void printBuyInfo(int price) {


        for(Member m : memberList) {

            System.out.println("상품가격이 " + price + "원일 경우 " + "이름이 " + m.getName() + "인 사람의" + " 등급은 " + m.getGrade() + "이고 " + m.getPoint()
            + "포인트를 보유중이며 " +m.calculateInterest(price)  + " 원을 할인받아 " + (price - (m.calculateInterest(price))) + "원에 물품을 구입할 수 있습니다");


        }

    }

    public void insertMember(Member m) throws OverMemberException {

        if (memberList.size() < 10) {

            memberList.add(m);
        } else throw new OverMemberException("수용 가능한 회원수를 초과했습니다");

    }

}


