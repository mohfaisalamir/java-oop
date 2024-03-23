package com.tutorial;

public class HeroStrength extends Hero{
//    String name = "Class Strength"; // jika ini dihaous maka "this.name" akan merujuk ke atribut name di  class parent (Hero)
    String name = "Class Strength";
    void display()
    {
        System.out.println("Name Strength is : "+this.name); //
        // jika "this" diganti menjadi "super", maka display batal meng-override, karena super.name otomatis merujuk ke atribut class parent,
        // mari kita liaht super.name, maka outputnya adalah "Name Strength is :  Hero"..
        System.out.println("Name Strength is : "+super.name); // super. akan selalu mengakses atribut superclass (class parent), dan super, juga..
        // bisa mengakses method di class parent, buakn hanya mengakses atribut.

        //dan jika atribut "name" di klass ini kita hapus, meskipun dalam pemanggilan name kita pakai "this", maka pemanggilan this.name akan merujuk
        // ke atribut milik class parent , karena atribut name pada "HeroStrength" dihapus
        // mati kita coba..
        System.out.println("Name Strength is : "+this.name);
        super.dummyMethod();
        this.dummyMethod();
    }

    // dummy method strength
    // jika dummyMethod pada child dihapus, maka akan merujuk pada dummyMethod di Superclass
  /*  void dummyMethod(){
        System.out.println("Dummy Method Strength");

    }*/
}
