package com.tutorial;
// public, ini akan terbuka untuk semuanya
// 1.   Public : jika method atau atribut dalam public secara explisit,
//      maka subclass tidak boleh mengurangi visibility.
// 2.   Private : jika method atau atribut dalam private secara explisit,
//      maka subclass tidak dapat mengakses
//3.    Final : method atau atribut dengan keywod final, akan di wariskan
//      Tapi tak bisa di Override, tapi bisa di overload (dalam kelas yang sama)..

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Ali",20);
        HeroIntel hero1 = new HeroIntel("Usman",17);

        hero.display();
        hero1.display();
        System.out.println(hero.getHealth());
        System.out.println(hero1.getHealth());

        hero.setHealth(25);
        hero1.setHealth(30);

        hero.display();
        hero1.display();
        System.out.println(hero.getHealth());
        System.out.println(hero1.getHealth());

        System.out.println("\n hasil setHealth() overload-an");
        hero.setHealth("reset");
        hero1.setHealth("reset");
        hero.display();
        hero1.display();
        System.out.println(hero.getHealth());
        System.out.println(hero1.getHealth());
    }
}
