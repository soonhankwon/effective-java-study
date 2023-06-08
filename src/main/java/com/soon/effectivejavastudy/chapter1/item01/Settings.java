package com.soon.effectivejavastudy.chapter1.item01;

import java.util.List;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {

    }

    // 생성자를 private 로 선언하여 외부에서 인스턴스 생성 불가
    private static final Settings SETTINGS = new Settings();

    // Settings 클래스의 유일한 인스턴스 보유 - 생성자 대신 정적 팩토리 메서드
    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main(String[] args) {
        List<String> list = List.of("soon", "han");
        System.out.println(list);
    }
}
