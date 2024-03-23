package com.tutorial;

public class Hero{
    //atrribut
    String name;
    double defencePower;
    //constructor
    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    //dan constructor itu bisa lebih dari satu
    // sehingga nanti jika ada object dengan kondisi tertentu, misal dia hanya memanggil name saja pada constructor (hanya memiliki parameter name)
    // maka dia akan merujuk pada constructor yang sesuai.. berikut ada contoh constructor opsi ke dua
    Hero(String name){
        this.name = name;

    }
    //method
    void display(){
        System.out.println("Name Hero is : "+this.name);
    }
}