package com.animal;

import com.print.console;

public class Animal {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void display(){
        console.log("It is one of specieces of animal : "+ this.getName());
    }
}
