package oop_pillars;

public abstract class Animal implements OxygenBreather,FourLegged,PrintInterface{

    public abstract void makeSound();
    public void make(){

    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
