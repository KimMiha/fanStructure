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

    public static ModelAApi instance(){return new FakeModelAApi();}
/**
            ● 바람 세기를 1-3 단계로 조절할 수 있다.
            ● 바람을 회전시키거나 고정시킬 수 있다.
            ● 선풍기를 켜거나 끌 수 있다.
            ● 타이머 기능이 있어서, 지정한 시간 뒤에 선풍기를 끌 수 있다.
            ● 리모콘으로 동일 기능을 실행할 수 있다.

            ○ 이런 모델을 만드려면, 다음과 같이 구분해야 함
                ■ 선풍기 제어 본질을 표현하는 추상 모델 모듈
                ■ 추상 모델을 각 선풍기 모델(HW)에 알맞게 구현한 모듈

            ○ 추상 모델 모듈은
                ■ HW(모터, 센서, 버튼 등)에 의존을 가지면 안 됨
                ■ 소프트웨어의 본질을 모델
            ○ 선풍기 모델 별 구현 모듈
                ■ 하드웨어에 대한 의존은 구현 모듈이 가짐
 */
}


