package com.soon.effectivejavastudy.chapter1.item05.factorymethod;

import com.soon.effectivejavastudy.chapter1.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictonaryFactory dictonaryFactory) {
        this.dictionary = dictonaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        // TODO spell checker code
        return dictionary.contains(word);
    }

    private List<String> suggestion(String typo) {
        // TODO spell checker code
        return dictionary.closeWordsTo(typo);
    }

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(new MockDictonaryFactory());
        spellChecker.isValid("test");
    }
}
