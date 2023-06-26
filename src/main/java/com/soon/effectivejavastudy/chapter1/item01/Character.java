package com.soon.effectivejavastudy.chapter1.item01;

import java.util.HashMap;
import java.util.Map;

public class Character {

    private char value;

    private String color;

//    private String fontFamily;
//
//    private int fontSize;

    // 잘 바뀌지 않는 부분 -> cache 재사용
    private Font font;

    static class Font {
        private String fontFamily;
        private int fontSize;

        public Font(String fontFamily, int fontSize) {
            this.fontFamily = fontFamily;
            this.fontSize = fontSize;
        }
    }

    static class FontFactory {
        private Map<String, Font> cache = new HashMap<>();

        public Font getFont(String font) {
            if(cache.containsKey(font)) {
                return cache.get(font);
            } else {
                String[] split = font.split(":");
                Font newFont = new Font(split[0], Integer.parseInt(split[1]));
                cache.put(font, newFont);
                return newFont;
            }
        }
    }

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "blue", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "blue", fontFactory.getFont("nanum:12"));
    }
}
