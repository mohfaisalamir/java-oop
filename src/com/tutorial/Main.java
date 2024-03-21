package com.tutorial;
// inharitance adalah hubungan is-a, bingung? jadi gini misal ==> HeroStrength is-a Hero,
// Dog is-a Animal..

import com.animal.Banteng;
import com.animal.Girafe;
import com.animal.Tiger;
import com.print.console;
// Super class, Parent class, Bsae class
class Hero{
    String name; // oke, kita tambah Method
    void display(){console.log("Name Hero : "+this.name);

    }
}
//Sub class, Child class, Derived class
class HeroStrength extends Hero{ // ini opsi bukan  kita pelajari di bab ini (inheritance, extend)
    // String name; // ini opsi bukan yang kita pelajari di bab ini
}
class HeroIntelligent extends Hero{

}

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "Ali Mustopo";
        console.log("Name Hero : "+hero.name);

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Sultan Murad I"; // ya error, tamnah atribut String name pada class HeroStrengt, atau extend ke Hero
        System.out.println("Name Hero : "+hero2.name);

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Bonaparte";
        System.out.println("Name Hero : "+hero3.name);

        System.out.println("\ndisplay by Method from extends Hero : ");
        hero.display();
        hero2.display();
        hero3.display();

        System.out.println("\nDunia binatang");
        Tiger animal = new Tiger();
        animal.setName("Panthera Trigis");
        Girafe animal1= new Girafe();
        animal1.setName("Jerapah Kongo");
        Banteng animal2=new Banteng();
        animal2.setName("Bos Javanicus");

        animal.display();
        animal1.display();
        animal2.display();

        //setelah ini kita akan belajar overiding, dimana si child dapat mengubah sifat sifat dari parentnya..
    }
}