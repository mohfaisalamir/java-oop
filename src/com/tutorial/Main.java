package com.tutorial;

public class Main {
    public static void main (String[] args){
        System.out.println("\nCASTING\n");

        //CASTING, mgubah paksa tipe
        double angka = 4.3;
        int int_angka = (int) angka;
        //System.out.println("dari double : "+angka+" , ke integer : "+int_angka+"\n\n");
        // output : dari double : 4.3 , ke integer : 4

        // Hero dengan kelas HeroIntel
        HeroIntel heroIntel = new HeroIntel("Semaun",20);

        // kita coba melakukan  up casting dari HeroIntel ke Hero
        Hero normal = (Hero)heroIntel;

        // saat di up-casting terdapat atribut yang hilang. yaitu type
        // System.out.println(normal.type); // terjadi uncopiled, karena setelah di up ke Hero, si Hero tidak punya type
        heroIntel.display();
        normal.display();

        heroIntel.castMegic();
        // jika manggil  castMegic() di object hero, maka tidak akan muncul(uncompiled)
        // karena hero tak memiliki fungsi classMagic
//        normal.castMegic(); // terjadi uncompiled

        // sekarang kita coba downCasting HeroIntel ke Hero
//        Hero hero = new Hero("Amar",21);
        HeroIntel heroToHeroIntel = (HeroIntel) normal; //CASTING trelarang jika dari super ke sub, tapi jika berawal dari sub lalu super dan ke sub lagi itu bisa
        heroToHeroIntel.display();
        heroToHeroIntel.castMegic(); // yap,  dan tidak berhasil, down casting tidak bisa, jika dari super ke sub, namun jika dari awal adalah sub lalu super lalu balik lagi ke sub,
        // ini down Casting yang dapat dicompile (bisa dilakukan)..

        // bagaimana dengan up casting?
//        HeroIntel heroIntel1 = new HeroIntel("Andro", 32);
//        heroIntel1.castMegic();
//        Hero hero1Up = (Hero)heroIntel;
//        hero1Up.display();
        //hero1Up.castMegic(); karena telah UpCasting maka terjadi uncompiled saat menggaet function castMagic(), karena tidak ada di Hero.

        //CONCLUSION
        // 1. Casting UP dari child ke parent, bisa
        // 2. Casting DOWN dari parent ke child, tidak bisa
        // 3. Casting UP DOWN dari child ke parent ke child, bisa
        // 4. casting apapun jika diawali dari child ke parent UP, bisa diulang2 DOWN-UP DOWN-UP.
        // 5. ini untuk apa gunanya? ini untuk POLYMORPHISME
        // gunanya untuk ini ==> Hero[2] = {HeroIntel,HeroAgility};

    }
}
