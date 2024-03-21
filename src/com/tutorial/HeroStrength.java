package com.tutorial;

import com.print.console;

public class HeroStrength extends Hero{
    double defencePower;
    void display(){
        // ini yang disebut Overriding, yaitu mengubah isi funsi di childClass,
        // dari funsi yang sebelumnya telah didefinisikan di parentClass
        // misal ada fungsi yang sama "display()" maka yang akan dieksekuisi terlebih dahulu adalah
        // display() milik subClass, jika tidak ada maka display milik superClass..
        console.log("\nHero Strength");
        console.log("Hero Name    : "+this.name);
        console.log("Hero Defence : "+this.defencePower);
    }
    // jika display HeroStrength  dihilangkan, maka perintah akan mencarikan display yang ada di class Parent
}
