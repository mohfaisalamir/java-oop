package com.tutorial;

public class Hero {
    String name;
    double attackPower, health;
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }
    //constructor polosan, (nama doang)
    Hero(String name){
        this.name = name;
    }
    void display(){
        System.out.println("\nName      : "+this.name);
        System.out.println("Attack      : "+this.attackPower);
        System.out.println("Health      : "+this.health);
    }
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " Attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }
    /*void attack(HeroStrength enemy){ // konsep ini akan dipelajari di polymorphisme
        System.out.println("\n" + this.name + " Attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }*/
    void takeDamage(double damage){
        System.out.println(this.name + " Receive damage " + damage );
        this.health = this.health - damage;
    }

}
