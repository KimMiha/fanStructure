package com.je.fan.modelA.api;

public class FakeModelAApi extends ModelAApi {
    WindSpeed speed;
    boolean power;
    boolean rotation;
    boolean timeOut;

    public void setSpeed(WindSpeed speed) {
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        System.out.println("선풍기 켬");
        this.power = true;
    }

    @Override
    public void turnOff() {
        System.out.println("선풍기 꺼짐");
        this.power = false;
    }

    @Override
    public void startRotation() {
        System.out.println("선풍기 회전시작");
        this.rotation = true;
    }

    @Override
    public void stopRotation() {
        System.out.println("선풍기 회전정지");
        this.rotation = false;
    }

    @Override
    public boolean getPowerButtonStatus() {
        return power;
    }

    @Override
    public WindSpeed getSpeedButtonStatus() {
        return speed;
    }

    @Override
    public boolean getRotationButtonStatus() {
        return rotation;
    }

    @Override
    public boolean isTimeOut() {
        return timeOut;
    }
}