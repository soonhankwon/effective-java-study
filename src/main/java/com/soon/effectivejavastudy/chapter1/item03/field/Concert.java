package com.soon.effectivejavastudy.chapter1.item03.field;

public class Concert {

    private boolean lightsOn;

    private boolean mainStateOpen;

    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }
}
