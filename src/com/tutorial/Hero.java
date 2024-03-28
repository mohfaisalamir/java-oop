package com.tutorial;

//public class Hero extends Object{ // pakai ini bisa
public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("The Hero's Name is " + this.name);
    }

    // Kita coba override method Object "equals()"
    @Override
    public boolean equals(Object otherObject) { // kita pakai Object (Superior class) agar bisa menerima semua Object
        // agar bisa Polymorphisme..
        if (this == otherObject) {
            System.out.println("\nini adalah Dua Object dengan reference (alamat) yang sama ");
            return true;
        } else if (this.getClass() == otherObject.getClass()){
            System.out.println("\nini adalah Dua Object dengan Konten atribut yang sama ");
            System.out.println("Reference Berbeda");
            Hero other = (Hero) otherObject; // meng-Hero-kan object
            if (this.name == other.name){
                System.out.println("Namanya sama");
                return true;
            }else {
                System.out.println("Namanya beda");
                return false;
            }

        }else {
            return false;
        }
    }
}