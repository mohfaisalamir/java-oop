package com.tutorial;
import java.nio.file.WatchEvent;
import java.time.temporal.WeekFields;
import java.util.EventObject;

class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    public Player(String name, double health) {
        this.name = name;
        this.health = health;
    }
    void equiptWeapon(Weapon weapon){
        this.weapon=weapon;
    }
    void equiptArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("Name\t "+this.name);
        System.out.println("Health\t "+this.health);
        this.weapon.display();
        this.armor.display();
    }
}
// kelas senjata
class Weapon{
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("the Weapon is : "+this.name+" and" +
                " the Power is : "+this.attackPower);
    }
}
// kelas baju besi
class Armor{
    double defensePower;
    String name;
    public Armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }
    void display(){
        System.out.println("the Armor is : "+this.name+" and " +
                "the Defence is : "+this.defensePower+"\n");
    }
}
public class Main {
    public static void main(String[] args) {
        // membuat objcet player
        Player player = new Player("Amir",891);
        Player player1= new Player("Otong",230);
        Player player2=new Player("Gundam",333);
        // membuat senjata
        Weapon pedang = new Weapon("tombak",16);
        Weapon senpi  = new Weapon("AKB 48",23);
        Weapon keris  = new Weapon("Keris Empu Kepek",12);
        // membuat armor
        Armor rasukWojo= new Armor("rompi wojo",20);
        Armor shield   = new Armor("Tameng Kebo",22);
        Armor tameng   = new Armor("Perisai",11);
        // menggunakan senjata

        // player 1
        player.equiptWeapon(pedang);
        player.equiptArmor(rasukWojo);
        player.display();

        // player 1
        player1.equiptWeapon(pedang);
        player1.equiptArmor(rasukWojo);
        player1.display();

        //player 2
        player2.equiptWeapon(keris);
        player2.equiptArmor(shield);
        player2.display();
//        System.out.println("TOLOL : "+player.armor.defensePower);
    }
}