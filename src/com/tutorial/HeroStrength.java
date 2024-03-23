package com.tutorial;

public class  HeroStrength extends Hero{

    HeroStrength(String name, double defencePower) { // agar bisa di compile, wajib bikin constructor karena harus menyerap constructor milik Hero, atau karena Hero memiliki constructor
        //  sehingga child harus  mengimbangi dengan membuat constructor agar bisa di compile,
        // dengan memanggil super("argument harus disamakan dengan constructor superclass")  dimana ini mewakili constructor Hero (superClass)..
        super(name,defencePower);// parameter yang adaa pada super, wajib disesuaikan dengan parameter yang ada di constructor Superclass,
        // jika tidak maka tidak bisa di compile..
    }
    HeroStrength(String name){
        super(name);
        // super 2 didalam constructor   HeroStrength 2  untuk memanggil constructor Hero yang sesuai dengannya ( constructor Hero 2 hanya memiliki satu parameter)

    }
}
