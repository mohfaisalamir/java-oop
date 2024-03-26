package com.tutorial;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public  void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return  this.name;
    }
    public void setHealth(double health){
        this.health = health;
    }
    public double getHealth(){
        return this.getHealth();
    }
    public void display(){
        System.out.println(this.name + " is reguler Hero");
    }
}
