package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.vo.Member;
import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.add;

public class MemberRepository extends Member {



    ArrayList[] MemberList = new ArrayList[10];








    public void printData () {


        System.out.println(getGrade() + "등급 회원 " + getName() + "의 포인트는 " + getPoint() + "이고, 이자 포인트는"
                 + calculateInterest(getPoint()) + "입니다");




    }


    public void printBuyInfo (int price) {


    }

    public void insertMember (Member m) {



        ArrayList<Member> MemberList = new ArrayList<>();

        if (MemberList.size() <= 10) {

        MemberList.add(m);
        } else{
            throw new OverMemberException
        }



        }


//        ArrayList[] MemberList = new ArrayList[10];



    }




