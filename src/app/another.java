package app;

public class another {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    public void horn() {
        System.out.println("Beep!");
    }

    // getter
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getWheels() {
        return wheels;
    }
    public String getColor() {
        return color;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    // setter
    public void setColor(String c){
        this.color = c;
    }
}
