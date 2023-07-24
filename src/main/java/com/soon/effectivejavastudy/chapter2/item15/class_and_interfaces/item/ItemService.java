package com.soon.effectivejavastudy.chapter2.item15.class_and_interfaces.item;

import com.soon.effectivejavastudy.chapter2.item15.class_and_interfaces.member.MemberService;

public class ItemService {

    MemberService memberService;

    boolean onSale;

    protected int saleRate;

    // 변경될 수 있다. 배열 필드
//    public static final String[] NAMES = new String[10];

    public ItemService(MemberService memberService) {
        if(memberService == null) {
            throw new IllegalArgumentException("MemberService should not be null");
        }
        this.memberService = memberService;
    }
}
