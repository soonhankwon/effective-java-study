package com.soon.effectivejavastudy.chapter1.item07.optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();
//        MemberShip memberShip = optional.get();
//        memberShip.hello();
        optional.ifPresent(MemberShip::hello);
        assertThatThrownBy(() -> optional.orElseThrow(IllegalArgumentException::new))
                .isInstanceOf(IllegalArgumentException.class);
    }
}