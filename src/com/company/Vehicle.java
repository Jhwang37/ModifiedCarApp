package com.company;

public class Vehicle  {
    private String make;
    private String model;
    private int year;
    private int speed;
    private boolean on = false;

    public Vehicle(){

    }
    public void startCar(boolean on){
        if (on = true){
            System.out.println("Car has turned on");
        }else{
            System.out.println("You have turned the car off");
        }
    }
    public void accelerate(int speed){
        System.out.println("Car is going " + speed);
    }
    public void stopCar(boolean on){
        if(on = true){
            System.out.println("Car is stopped");
        }else{
            System.out.println("Car continues to move");
        }
    }

}
