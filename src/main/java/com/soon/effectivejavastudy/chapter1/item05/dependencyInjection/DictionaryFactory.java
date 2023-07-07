package com.soon.effectivejavastudy.chapter1.item05.dependencyInjection;

import com.soon.effectivejavastudy.chapter1.item05.DefaultDictionary;
import com.soon.effectivejavastudy.chapter1.item05.Dictionary;

public class DictionaryFactory {
    public static Dictionary get() {
        return new DefaultDictionary();
    }
}
