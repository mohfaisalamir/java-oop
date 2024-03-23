package com.tutorial;
// subclass

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Todoroki",16);
        hero.display();
        // ketika kita deklarasikan satu object dengan String nama (misal "Todoroki"), maka string tersebut akan mencari
        // constructor dari Hero, lalu dimasukan ke atribut dan mengisi (mendefinisi) atribut tersebut, lalu ditampilkan di display,..
        HeroStrength hero1 = new HeroStrength("Midoriya",21);
        hero1.display();
        // satu object dengan String nama ("Midoriya"), maka string tersebut akan mencari constructornya "HeroStrength{}", dimana string name dimasukan Ke
        // super("argument") dimaan ini untuk menghubungkan ke konstructor Hero atau
        // bisa disebut bahwa super() ini memanggil constructor Hero, lalu mengisi atribut Hero dan di cetak..

        // kesimpulannya,
        // untuk kita membuat subClass constructor, minimal kita harus
        // membuat Constructor subClass dengan memanggil constructor Superclass menggunakan super()

        // berikut adalah obecet dengan memakai constructor ke dua pada superClass Hero
        Hero hero2 = new Hero("All Migth");
        HeroStrength hero3 = new HeroStrength("Tanjiro",22);// ini tidak bisa memakai constructor Herro 2, karena dia merujuk pada super()
        // dimana super ini merujuk pada constructor Hero 1, karena menyesuaikan jumlah parameternya
        // jika ingin merujuk ke constructor Hero 2.. maka panggil super() dengan membuat constructor HeroStrength opsi 2 baru dengan parameter constructor Hero 2
        HeroStrength hero4 = new HeroStrength("Uraka");
        hero2.display();
        hero3.display();
        hero4.display();

        // kesimpulannya, jika kita menggunakan constructor pada subclass, maka harus maching dengan constructor pada superClass.
    }
}