package com.tutorial;

import com.hero.Hero; // Hero adalah abstract, maka gak akan pernah terpakai
import com.hero.HeroAgility;
import com.hero.HeroIntel;

// Abstract : yaitu ide, gambaran, yang masih belum jelas wujudnya, bisa dikatakan sketsa
// 1. Class Abstract, tidak bisa meng-instance (mencetak) sebuah object,
// 2. Class Abstract, menurunkan atribut dan methodnya secara "PAKSA" ke sub-class nya. ini yang mebdeakan dengan SuperClass biasa,
// 3. Jika pada Superclass biasa, childnya bisa berbeda2 atributnya, namun jika di Abstract semua sama, meski implemennya beda.
public class Main {
    public static void main(String[]args){
        // membuat object dari class non-abstract
        HeroIntel hero = new HeroIntel("Usamah");
        hero.display();// yah seperti instance Class pada umumnya, selanjutnya kita coba instance class abstract

        // membuat object dari class Abstract
        // Hero hero1 = new Hero("Muldoko"); // karena Hero adalah abstract, maka terjadi uncompiled , (17:23 java: com.hero.Hero is abstract; cannot be instantiated)
        // hero1.display();
        HeroAgility hero2 = new HeroAgility("Karto");
        hero2.display();

    }
}