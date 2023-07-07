package com.soon.effectivejavastudy.chapter1.item05.factorymethod;

import com.soon.effectivejavastudy.chapter1.item05.DefaultDictionary;
import com.soon.effectivejavastudy.chapter1.item05.Dictionary;

public class DefaultDictonaryFactory implements DictonaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
