package oop_pillars;

public abstract class Animal implements OxygenBreather,FourLegged,PrintInterface{

    public abstract void makeSound();

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
