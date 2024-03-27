package com.hero;

public class HeroStrength extends Hero{
    public HeroStrength(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("I am "+this.name +" i am an " + " Hero");
        // this.name compiled, ini bukti bahwa "protected" dapat diakses di kelas lain selama itu turunannya
        // tapi jika "this.name" diakses di class Main maka akan uncompiled, karena Main bukan child dari parent(Hero)..
        // jika kerword "private String name", maka disini terjadi error.
        System.out.println(this.getName());

    }
}
