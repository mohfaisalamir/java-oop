package com.tutorial;
public class Hero {
    public String name;
    private double health;
    //constructor
    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }
    // getter
    public double getHealth(){ // baik public maupun default, untuk method sejauh ini masih aman, jika dipakai di file/class/subclass lain.
        // dan jangan pakai private, buat apa getter tapi tak dapat diakses?, ini menyalahi tujuan ..
        return this.health;
    }
    public void display(){
        System.out.println(this.name +" mempunyai kesehatan sebesar "+this.health);
    }

    // setter, ini akan diturunkan (inherit)
    final  void  setHealth(double newHealth){
        this.health = newHealth;
    }
//    mencoba meng-overload final
    final  void  setHealth(String newHealth){
        if (newHealth.equals("reset")){
            this.health = 40;
        }
}

}
