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
    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
//        attackPower = 100000; // salah satu penyakit haccking (cheating), perlu pembungkusan / enkapsulasi
        System.out.println(this.name +" attacking "+ opponent.name+" with power "+attackPower);
        opponent.defence(this.weapon.attackPower, this.name);
    }
    void defence(double attackPower,String person){
        // sebenarnya ngambil damage ding,,
        double damage;
        if(this.armor.defensePower<attackPower){
            damage = attackPower-this.armor.defensePower;
        }else {
            damage = 0;
        }
        this.health-=damage;
        System.out.println(this.name +" gets damage "+damage+" by "+person);
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
        Weapon senpi  = new Weapon("AKB 48",28);
        Weapon keris  = new Weapon("Keris Empu Kepek",12);
        // membuat armor
        Armor rasukWojo= new Armor("rompi wojo",20);
        Armor shield   = new Armor("Tameng Kebo",22);
        Armor tameng   = new Armor("Perisai",11);
        // menggunakan senjata

        // player 1
        player.equiptWeapon(senpi);
        player.equiptArmor(rasukWojo);
        player.display();

        // player 1
        player1.equiptWeapon(pedang);
        player1.equiptArmor(tameng);
        player1.display();

        //player 2
        player2.equiptWeapon(keris);
        player2.equiptArmor(shield);
        player2.display();
//        System.out.println("TOLOL : "+player.armor.defensePower);
        //aktifitas
        System.out.println("PERTEMPURAN");
        System.out.println("\nEpisode - 1");
        player.attack(player2);
        player.display();
        player2.display();
        System.out.println("PERTEMPURAN");
        System.out.println("\nEpisode - 2");
        player1.attack(player);
        player.display();
        player1.display();
        System.out.println("PERTEMPURAN");
        System.out.println("\nEpisode - 3");
        player2.attack(player1);
        player1.display();
        player2.display();
        System.out.println("PERTEMPURAN");
        System.out.println("\nEpisode - 4");
        player.attack(player1);
        player.display();
        player1.display();


    }
}