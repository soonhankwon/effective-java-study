package com.soon.effectivejavastudy.chapter1.item05.springioc;

import com.soon.effectivejavastudy.chapter1.item05.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;
//POJO
@Component
public class SpellChecker {

    private Dictionary dictionary;

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
