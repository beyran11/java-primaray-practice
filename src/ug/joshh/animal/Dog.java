package ug.joshh.animal;

public class Dog {

    private String name = "alphhiii";
    private int speed = 25 ;
    private int weight = 35 ;

    public void changeName(String n){
        name = n;
    }

    public void changeSpeed(int s){
        speed = s;

    }

    public void changeWeight(int w){
        weight=w;
    }

    public void printStates(){
        System.out.println("Name: "+name);
        System.out.println("Speed: "+speed);
        System.out.println("Weight: "+weight);
    }

}
