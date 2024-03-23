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
    void attack(Hero enemy){ // Hero, karenia dia super class, maka dia bisa menerima Argumen manapun asal berasal dari ojeknya sendiri (Hero)
        // atau  turunannya (HeroTrength)
        System.out.println("\n" + this.name + " Attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }
  /*  void attack(HeroStrength enemy){
  // konsep ini dipelajari di polymorphisme,
  // jadi, ini akan terjadi Error jika menerima Argument Hero, sebab :
  // Hero(superClass) bukan turunan, sehingga objectnya tidak bisa memakai parameter HeroStrength (subclass),jika dipakasa maka error (uncompiled)
  // maka parameter HeroStrength hanya bisa menerima argumen object HeroHerostrength(dirinya sendiri)

        System.out.println("\n" + this.name + " Attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }*/
    void takeDamage(double damage){
        System.out.println(this.name + " Receive damage " + damage );
        this.health = this.health - damage;
    }

}
