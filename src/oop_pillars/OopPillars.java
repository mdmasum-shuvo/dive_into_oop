package oop_pillars;

public class OopPillars {

    public static void main(String[] args) {

        Airport airport = new Airport();
        Helicopter helicopter = new Helicopter();
        AirPlane plane = new AirPlane();
        //helicopter.fly("Dhaka","Chittagong",4);
        // plane.fly("Bangladesh","UAE",100);
        // helicopter.fly("Dhaka","Chittagong",4);
        airport.accept(plane);
        // airport.accept(plane);
        System.out.println(plane.getDestination());

        Cat cat=new Cat();

        Animal animal=new Cat();
        Animal animal1=new Dog();
        animal.makeSound();
        animal1.makeSound();

    }
}
