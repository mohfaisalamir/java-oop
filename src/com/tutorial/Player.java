package com.tutorial;//// untuk file yang masih satu package, maka tidak perlu impor ..
// ini  masih di satu package, jadi masih luwes bisa diakses,
// sebenernya masih bisa meski file ada di luar package, namun dengan perlakuan tertentu,
// seperti pe-impor-an..

import com.terminal.console;
import com.terminal.terminal;

// visibility default
class Player{ // nama class ini harus sama  dengan nama filenya
    private String name;

    Player(String name){
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return  this.name;
    }
    // kita buktikan bahwa clas console bisa diakses dimana pun , kita ganti sout menjadi console.log
    void show(){
        //System.out.println("Name Player is , "+ this.name); // kita komen kita ganiti class.func ==> console.log
        console.log("\nName Player is , "+ this.name);
        console.log("\nNjajal ngakses class console log, \nnjajal manfaat keyword\"public\"");
        // kita coba class terminal
        terminal.log("nyoba treminal di class Player");
    }

}