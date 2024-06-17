package com.ohgiraffers.member.run;

import com.ohgiraffers.member.controller.MemberRepository;
import com.ohgiraffers.member.controller.OverMemberException;
import com.ohgiraffers.member.model.vo.Gold;
import com.ohgiraffers.member.model.vo.Silver;
import com.ohgiraffers.member.model.vo.Vip;

public class Run {

    public static void main(String[] args) throws OverMemberException {

        int price = 10000;

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insertMember(new Silver("홍길동", "Silver", 1000));
        memberRepository.insertMember(new Silver("고길동", "Silver", 2000));
        memberRepository.insertMember(new Silver("홍동민", "Silver", 3000));
        memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
        memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
        memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
        memberRepository.insertMember(new Vip("이순신", "Vip", 10000));
        memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
        memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
        memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
        memberRepository.insertMember(new Vip("이순신", "Vip", 10000));


        System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
        memberRepository.printData();

        memberRepository.printBuyInfo(price);



    }

}
