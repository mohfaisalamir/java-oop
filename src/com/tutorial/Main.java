package com.tutorial;
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali Muhammad");
        hero1.display();

        HeroAgility hero = new HeroAgility("Ali Murtopo");
        hero.display();

        HeroStrength hero2 = new HeroStrength("Sukarni");
        hero2.display();

        //Polymorphic
        Hero hero3 = new HeroIntel("Khalid bin Walid");
        hero3.display();
        HeroIntel hero4 = new HeroIntel("Umar ibnu Al-Khattab");
        hero4.display();
        hero4.showOff();
//        hero3.showOff();
//        ini terlarang
//        HeroAgility hero5 = new Hero("Muawiyah");
//        hero5.display(); // uncompiled ini karena terbalik, Hero bukan turunan HeroAgility

        // ini juga terlarang, karena sesama subclass tidak saling mewarisi
        // HeroAgility hero5 = new HeroIntel("Usman");

        //Array List
        Hero[] kumpulanHero = new Hero[5];
        // karena semua object turunan Hero,
        // maka mereka bisa masuk dalam array bertype Hero
        kumpulanHero[0]     = hero;
        kumpulanHero[1]     = hero1;
        kumpulanHero[2]     = hero2;
        kumpulanHero[3]     = hero3;
        kumpulanHero[4]     = hero4;// ini masih dianggap Hero karena turunan (ter-Casting atau bisa dicasting dengan Induknya),
        // ini bisa disebut casting(mengubah type dari HeroIntel ke Hero)
        //  namun jika ada method lain maka akan terjadi uncompiled seperti dibawah ini..


        // kita bisa bikin array list dari kumpulan object yang berbeda Class tapi harus dalam satu turunan heheh..
        System.out.println("\nDisplay Array List");
        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();
        kumpulanHero[3].display();
        kumpulanHero[4].display();
//        kumpulanHero[4].showOff(); // uncompiled, karena bukan polymorph ke Hero, HeroIntel murni jika mengandung showOff();
//        dan uncompiled karena didalam Hero todak ada showOff();..
        // tapi jika di kembalikan menjadi berikut
        hero4.showOff();// maka akan jalan, karena ini object murni HeroIntel yang elum ter-Casting seperti yang ada pada ArrayList
//        guananya PolyMorphism, silakan dilihat di file class Hero
    }
}