package com.soon.effectivejavastudy.chapter2.item15.class_and_interfaces.item;

import com.soon.effectivejavastudy.chapter2.item15.class_and_interfaces.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    MemberService memberService;

    @Test
    void itemService() {
        ItemService service = new ItemService(memberService);
        assertNotNull(service);
        //package-private or getter or getter(package-private)
        assertNotNull(service.memberService);
    }
}