package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nhaloo");
        Hero hero = new Hero();
        HeroStrength hero1 = new HeroStrength();


        // display
        hero.display();
        hero1.display();

        // kita coba panggil dummy method di hero1 tapi pakai super. maka ouotputnya adalah method dummy hero
        // dummy strengt
        // mengandung function dummy method hero, karena memakai super.dummyMethod()

        // outputnya adalah
//        Dummy Method Hero
//        Dummy Method Strength
//        smahalnya dengan atribut, jika dummyMethod pada strength dhiapus, maka this.dummyMethod akan merujuk ke dummyMethod milik Hero (superClass)
//        walaupun dia pakai this.dummyMethod bukan super.dummyMethod..
    }
}