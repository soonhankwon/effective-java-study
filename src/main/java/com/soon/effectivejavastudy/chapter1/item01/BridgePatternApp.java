package com.soon.effectivejavastudy.chapter1.item01;

public class BridgePatternApp {

    public static void main(String[] args) {
        Champion kdaAri = new KDAAri(new KDA());
        kdaAri.skillE();
        kdaAri.skillQ();
        kdaAri.move();
        kdaAri.speak();
    }


    interface Champion {
        void skillQ();

        void skillW();

        void skillE();

        void skillR();

        void move();

        void speak();
    }

    static class KDAAri implements Champion {

        private Skin skin;

        public KDAAri(Skin skin) {
            this.skin = skin;
        }

        public void speak() {
            skin.specialTalk();
        }

        @Override
        public void skillQ() {
            System.out.println("kda ari q");
        }

        @Override
        public void skillW() {
            System.out.println("kda ari w");
        }

        @Override
        public void skillE() {
            System.out.println("kda ari e");
        }

        @Override
        public void skillR() {
            System.out.println("kda ari r");
        }

        @Override
        public void move() {
            System.out.println("kda ari move");
        }
    }

    interface Skin {
        void specialTalk();
    }

    static class KDA implements Skin {
        public void specialTalk() {
            System.out.println("KDA SKIN SPECIAL");
        }
    }

    static class DefaultChampion implements Champion {

        private Skin skin;

        private String name;

        public DefaultChampion(Skin skin, String name) {
            this.skin = skin;
            this.name = name;
        }

        @Override
        public void speak() {

        }

        @Override
        public void skillQ() {

        }

        @Override
        public void skillW() {

        }

        @Override
        public void skillE() {

        }

        @Override
        public void skillR() {

        }

        @Override
        public void move() {

        }
    }
}
