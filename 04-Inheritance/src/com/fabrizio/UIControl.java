package com.fabrizio;

public class UIControl {
    protected boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled= isEnabled;
        System.out.println("Ui Control");
    }

    public void enable(){
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
