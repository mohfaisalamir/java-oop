package com.tutorial;
import com.print.console;

public class Player {
    private static int jumlahPlayer;
    private String name;


    //overloading constructor
    // overloading, memiliki constructor/method yang sama tapi perlakuan berbeda
    // opsi 1
    Player(String name){
        this.jumlahPlayer++;
        this.name = name;
    }
    // opsi 2
    Player(){
        this.jumlahPlayer++;
        this.name = "Karim"+jumlahPlayer;
    }

    public String getName(){
        return  this.name;
    }
    public  void show(){
        console.log("Nama : "+this.name);
    }
}
