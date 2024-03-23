package com.tutorial;
public class Hero {
    String name;
    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Name\t:\t" + this.name);
    }
    // ini guananya PolyMorphism
    // jika ada attack maka semua argumen bisa masuk asal emrupakan obecet turunan dari parent yang sama
    // misal
    void attack(Hero enemy /*, IAttack serangan*/){ // IAattack ini bisa semua serangan, attack, criticalDamage, skill, shotDamage dll
        System.out.println(this.name + " Attackin " + enemy.name);
    }

}