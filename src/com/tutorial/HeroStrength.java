package com.tutorial;

public class HeroStrength extends  Hero{
    String type = "Strength"; // menambah atribut baru pada subclass ini diperbolehkan, bisa dicompile
    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }
    // untuk memanggil constructor super class 2
    // ini ada atau tidak, bebas. (constructor bisa di buat sesuka hati sesuai kebuthan, bisa tanpa parameter atau dengan parameter lengkap)
    //  ..
    HeroStrength(String name) {
        super(name);
    }
    @Override // cuma anotasi gak ada pngaruh apapun,
        //override display, me-reassign isi display (meng-override sesuatu yang sama yang ada di parentClass)
    void display(){
        super.display();
        System.out.println("Type Hero   : " + this.type);
    }
    //sekarang kita override si takeDamage
    @Override
    void takeDamage(double damage){
        // jika HeroStrength mendapat serangan, dia mampu memecah serangan menjadi dua
        System.out.println(this.name + " Receive half damage " + 0.5 * damage );
        this.health = this.health - 0.5*damage;
    }
}
