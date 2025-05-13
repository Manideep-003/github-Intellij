package com.man.introduction.Interfaces;

public class Nicecar {
    private engine engine;
    public Nicecar(){
        engine=new powerengine();
    }
    public Nicecar(engine engine){
      this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop(5);
    }
    public void upgradeengine(){
     this.engine=new electricengine();
    }
}
