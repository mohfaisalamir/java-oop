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

        hero.display();
        hero1.display();
        hero2.display();
        heroStrength.display();

        //meskipun attac() milik Hero, HeroStrengt tetep bisa mengakses karena mewarisi sifatnya
    }
}