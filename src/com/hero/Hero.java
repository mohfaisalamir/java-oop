package com.hero;

public abstract class Hero {
    private String name;
    public Hero(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Nama saya adalah , "+ this.name);
    }
}
