package com.je.fan.modelA.api;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FakeModelAApiTest {


    FakeModelAApi fakeFan = new FakeModelAApi();

    @Test
    public void setSpeed_바람의_속도_조절() {
        fakeFan.setSpeed(ModelAApi.WindSpeed.LEVEL0);
        assertThat(fakeFan.speed, is(ModelAApi.WindSpeed.LEVEL0));
    }

    @Test
    public void turnOn() {
    }

    @Test
    public void turnOff() {
    }

    @Test
    public void startRotation() {
    }

    @Test
    public void stopRotation() {
    }

    @Test
    public void getPowerButtonStatus() {
    }

    @Test
    public void getSpeedButtonStatus() {
    }

    @Test
    public void getRotationButtonStatus() {
    }

    @Test
    public void isTimeOut() {
    }
}