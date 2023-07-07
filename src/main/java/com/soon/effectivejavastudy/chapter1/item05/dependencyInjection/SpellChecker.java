package com.soon.effectivejavastudy.chapter1.item05.dependencyInjection;

import com.soon.effectivejavastudy.chapter1.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    // Dictionary -> interface
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        // TODO spell checker code
        return dictionary.contains(word);
    }

    private List<String> suggestion(String typo) {
        // TODO spell checker code
        return dictionary.closeWordsTo(typo);
    }
}
