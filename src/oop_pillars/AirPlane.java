package oop_pillars;

public class AirPlane implements FlyingTransport{

    private String origin;
    private String destination;
    private int passenger;
    private String pitchAngle;
    private String yawAngle;
    private int seats;



    public void reserveSeats(int n) {
        seats -= n;
    }


    @Override
    public void fly(String origin, String destination, int passenger) {
        this.origin=origin;
        this.destination=destination;
        this.passenger=passenger;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getPassenger() {
        return passenger;
    }

    public String getPitchAngle() {
        return pitchAngle;
    }

    public String getYawAngle() {
        return yawAngle;
    }

    public int getSeats() {
        return seats;
    }
}
