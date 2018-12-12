package com.je.fan.modelA.api;

public abstract class ModelAApi {
    public static enum WindSpeed{LEVEL0, LEVEL1, LEVEL2, LEVEL3}

    public abstract void setSpeed(WindSpeed speed);
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void startRotation();
    public abstract void stopRotation();

    public abstract boolean getPowerButtonStatus();
    public abstract WindSpeed getSpeedButtonStatus();
    public abstract boolean getRotationButtonStatus();

    public abstract boolean isTimeOut();

    public static ModelAApi instance(){return new FakeModelApi();}
    }
}
