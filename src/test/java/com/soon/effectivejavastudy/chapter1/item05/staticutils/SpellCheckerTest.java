package com.soon.effectivejavastudy.chapter1.item05.staticutils;

import com.soon.effectivejavastudy.chapter1.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpellCheckerTest {

    @Test
    void isValid() {
        // test 시 test 용 mock 클래스 사용가능
        com.soon.effectivejavastudy.chapter1.item05.dependencyInjection.SpellChecker spellChecker = new com.soon.effectivejavastudy.chapter1.item05.dependencyInjection.SpellChecker(new DefaultDictionary());
        assertTrue(spellChecker.isValid("test"));
    }
}