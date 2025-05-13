package com.man.introduction.Interfaces;

public class car implements engine,brake{

    @Override
    public void brk() {
        System.out.println("i breake like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("i will break");
    }

    @Override
    public void start() {
        System.out.println("i will start");
    }

    @Override
    public void stop(int x) {
        System.out.println("immediately stop"+x);
    }

}
