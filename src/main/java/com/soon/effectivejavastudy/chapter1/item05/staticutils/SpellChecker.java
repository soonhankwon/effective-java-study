package com.soon.effectivejavastudy.chapter1.item05.staticutils;


import com.soon.effectivejavastudy.chapter1.item05.DefaultDictionary;
import com.soon.effectivejavastudy.chapter1.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    // 자원을 직접 명시 new Dictionary
    private static final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {}

    public static boolean isValid(String word) {
        // TODO spell checker code
        return dictionary.contains(word);
    }

    private static List<String> suggestion(String typo) {
        // TODO spell checker code
        return dictionary.closeWordsTo(typo);
    }
}
