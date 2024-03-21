package com.tutorial;
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "Saitama";
        hero.display();

        HeroStrength hero1 = new HeroStrength();
        hero1.name = "Mountain Lady";
        hero1.defencePower = 120;
        hero1.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Black Widow";
        hero3.display(); //ini display() yang diambil adalah milik parent,
        // karena subClass HeroIntelligent tidak mendefinisikan kelas dan method apapun, sehinngga semua merujuk pada parent
        // untkuk pemanggilan fungsi/method yang diprioritaskan pertama adalah method classChild, selanjutnya classParent..

        //Overriding
        // ini yang disebut Overriding, yaitu mengubah isi funsi di childClass,
        // dari funsi yang sebelumnya telah didefinisikan di parentClass, (nama funsi sama tapi memliki sifat berbeda)
        // misal ada fungsi yang sama "display()" maka yang akan dieksekuisi terlebih dahulu adalah
        // display() milik subClass, jika tidak ada maka display() milik superClass..

        // dalam tanda kutip, Override bisa dikatakan me - reassign method
    }
}