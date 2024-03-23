package com.tutorial;
public  class Main {
    public static void main(String[] args) {
        // test
        Hero hero = new Hero("Todoroki",33,21);
        hero.display();

        // ini extends denganconstructor superClass 1
        HeroStrength hero1 = new HeroStrength("Madara",98,66);
        HeroStrength heroStrength = new HeroStrength("nanabi",43,122);
        // ini extends denganconstructor superClass 2
        HeroStrength hero2 = new HeroStrength("Uraka");

        hero1.display();
        hero2.display();

        hero.attack(hero2);
        hero1.attack(hero);
        hero1.attack(heroStrength);
        heroStrength.attack(hero);
        hero.attack(heroStrength);

        hero.display();
        hero1.display();
        hero2.display();
        heroStrength.display();

        //meskipun attac() milik Hero, HeroStrengt tetep bisa mengakses karena mewarisi sifatnya

        // Polymorphism
        // Polimorfisme adalah kemampuan objek untuk merespons dengan cara yang berbeda tergantung pada konteksnya, memungkinkan objek dari kelas turunan untuk digunakan sebagai objek dari kelas induk, dengan metode yang di-override oleh kelas turunan merespons dengan cara yang berbeda tergantung pada tipe objek yang sebenarnya.
        // contoh dari polymorphism, diatas kita telah membuat object heroStrength bertipe HeroStrength, namun sebenarnya dia juga bisa dianggap ber tipe Hero
        // ini lah yang diangap sifat polimorphism, dan hanya berlaku pada object turunan,
        // karena akan uncompiled jika kita memaksakan dia bertype HeroStrength (turunannya)..

        // penjelsan dari phind
        // Polimorfisme
        // Dalam OOP, polimorfisme adalah kemampuan objek untuk memiliki banyak bentuk.
        // Dalam kode ini, objek heroStrength dapat dianggap sebagai objek Hero karena HeroStrength adalah turunan dari Hero.
        // Ini adalah contoh dari polimorfisme tipe, di mana objek dari kelas turunan dapat digunakan sebagai objek dari kelas induk.
        // Pewarisan adalah prinsip dasar dalam OOP, di mana kelas turunan mewarisi semua metode dan properti dari kelas induk.
        // Dalam hal ini, HeroStrength mewarisi metode attack() dari Hero, yang menunjukkan pewarisan.
    }
}