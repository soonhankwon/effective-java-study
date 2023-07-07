package com.soon.effectivejavastudy.chapter1.item05.factorymethod;

import com.soon.effectivejavastudy.chapter1.item05.Dictionary;
import com.soon.effectivejavastudy.chapter1.item05.MockDictionary;

public class MockDictonaryFactory implements DictonaryFactory {

    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
