package com.soon.effectivejavastudy.chapter1.item03.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConcertTest {

    @Test
    void perform() {

        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightOn());
        assertTrue(concert.isMainStateOpen());
    }
}