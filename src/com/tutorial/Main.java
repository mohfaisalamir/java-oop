package com.tutorial;

public class Main extends Object{
    public static void main(String[] args) {
        System.out.println("\ndinacok");

        Hero hero = new Hero("Cokro");
        hero.display();

        Object hero2 = new Object();
//        hero2.name; // terjadi uncompiled, karena class Object didak mendiclare name
        // 1. Object adalah kelas seluruh kelas , merupakan kelas bawaan dari java,
        // 2. Object,  semua class sebenernya meng-extends clas Objec, cuma tidak diperlihatkan, ==> di-exstends atau tidak samasaja
        System.out.println("Ini reference Hero "+hero.toString());
        System.out.println("Ini reference Hero2 "+hero2.toString());

        Object object1 = hero;
        System.out.println("Pasti object1 dan hero berada pada referensi(alamat) yang sama "+object1.toString() );
        // 3. Object memiliki berbagai method dan atribut, diantaranya equals(), toString(), getClass(), dan masih jutaan lagi
        // 4. kita dapata membuat objec tanpa class, namun sebenernya object kita di instance dari Object (king of class)
        //
        // sekarang mari kita coba salah satu Method dari Object, yaitu "equals()", dan "getClass()"..
        System.out.println("\ntesting object method (equals dan getClass)");
        System.out.println(hero2.equals(hero)); // false, karena beda reference
        System.out.println(hero.equals(object1));// true, karena object1 merujuk pada alamat yang sama (sengaja di re-assing dengan hero)

//        skerang kita coba membuat object dengan nama atau atribut yang sama
        Hero hero1 = new Hero("Joko");
        Hero hero3 = new Hero("Joko");
        System.out.println(hero1.equals(hero3)); // False, karena beda reference, kendatipun seluruh ibi nya sama
        // namun equals hanya membandingkan skala Object yang artiny kesamaan kesekuruhan object, dan sama reference

        Jagoan hero4 = new Jagoan("Joko");// jika di equals jelas False, kearena beda alamat(reference)
        hero4.display();

        // sekarang kita bandingkan atributnya
        System.out.println("\ntaek");
        System.out.println(hero3.equals(hero2));

    }
}
