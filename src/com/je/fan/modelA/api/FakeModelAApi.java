package com.je.fan.modelA.api;

public class FakeModelAApi extends ModelAApi {
    WindSpeed speed;
    boolean

    @Override
    public void setSpeed(WindSpeed speed) {
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        System.out.println("선풍기 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("선풍기 꺼짐");
    }

    @Override
    public void startRotation() {

    }

    @Override
    public void stopRotation() {

    }

    @Override
    public boolean getPowerButtonStatus() {
        return false;
    }

    @Override
    public WindSpeed getSpeedButtonStatus() {
        return null;
    }

    @Override
    public boolean getRotationButtonStatus() {
        return false;
    }

    @Override
    public boolean isTimeOut() {
        return false;
    }
}