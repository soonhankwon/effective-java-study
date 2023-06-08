package com.soon.effectivejavastudy.chapter1.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StaticFactoryMethodTest {

    @Test
    @DisplayName("인스턴스 생성 방법 통제 - 싱글톤, 정적 팩토리 메서드 활용")
    void getSingletonInstance() {
        Content instance1 = Content.getInstance();
        Content instance2 = Content.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }

    static class Content {
        private String name;
        private int price;

        private Content() {
        }

        private static final Content CONTENT = new Content();

        public static Content getInstance() {
            return CONTENT;
        }
    }
}
