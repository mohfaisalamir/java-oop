package com.tutorial;


public class HeroIntel extends Hero{
    HeroIntel(String name, double health){
        super(name,health);
//        System.out.println(this.health); // tidak bisa diakses
    }
    //override getHealth
    // karena di superClass public, maka di subClass wajib public, jika tidak maka uncompiled..
//    public double getHealth(){
//        return this.getHealth();
//    } // malah sesat, ini terjadi looping, karena manggil terus
    // visiblity harus sama dengan superclass
    public void display(){
        System.out.println(this.name +" mempunyai banyak "+this.getHealth());
    }

    // override final, ini uncompiled jika di override
//    final  void  setHealth(double newHealth){
//        this.health = newHealth;
//    } // ini tidak bisa di override

    // karena override tidak berlaku pada final, maka final bernilai eteap yang gak bisa diubah strukur blok kodenya yang berada di superClass
}
