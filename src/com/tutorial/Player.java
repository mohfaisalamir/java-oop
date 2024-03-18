package com.tutorial;
// ini  masih di satu package, jadi masih luwes bisa diakses,
// sebenernya masih bisa meski file ada di luar package, namun dengan perlakuan tertentu,
// seperti pe-impor-an..

class Player{ // nama class ini harus sama  dengan nama filenya
    private String name;

    Player(String name){
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    void show(){
        System.out.println("Name Player is , "+ this.name);
    }

}