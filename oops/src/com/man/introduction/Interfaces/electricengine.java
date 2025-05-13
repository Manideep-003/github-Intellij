package com.man.introduction.Interfaces;

public class electricengine implements engine{
    @Override
    public void brake() {
        System.out.println("electric engine break");
    }

    @Override
    public void start() {
        System.out.println("electricengine start");
    }

    @Override
    public void stop(int x) {
        System.out.println("electric engine stop");
    }
}
