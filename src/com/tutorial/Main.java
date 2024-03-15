package com.tutorial;

import java.util.Scanner;

class Player{
    private String name;
    private int baseAttack;
    private int baseHealth;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementAttack;
    private int incementHealth;
    public Player(String name){
        this.name = name;
        this.baseAttack = 210;
        this.baseHealth = 100;
        this.level = 1;
        this.incrementAttack = 22;
        this.incementHealth = 20;
    }
    void display(){
        System.out.println("\nPlayer\t\t\t: "+this.name);
        System.out.println("Level\t\t\t: "+this.level);
        System.out.println("Maximum Health\t: "+this.maxHealth());
        System.out.println("Maximum Attack\t: "+this.getAttackPower());
    }
    void setArmor(Armor armor){
        this.armor = armor;
    }
    void setWeapon(Weapon weapon){
        this.weapon=weapon;
    }
    int getAttack(){
        return this.baseAttack;
    }
    public int maxHealth(){
        return this.baseHealth +this.level * this.incementHealth + this.armor.getAddHealth();
    }
    public int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
    public void levelUp(){
        this.level++;
    }
    public void attacking (Player opponent){
        System.out.println(this.name +" Attacking "+opponent.name);
        int opponentLostPower = this.maxHealth()-opponent.maxHealth();
        opponent.baseAttack = opponentLostPower;

    }
}
class Weapon{
    private String name;
    private int attack;
    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
    public int getAttack(){
        return this.attack;
    }
}
class Armor{
    private String name;
    private int strength;
    private int health;
    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health=health;
    }
    public int getAddHealth(){
        return this.health + this.strength * 10;
    }
}
public class Main {
    public static void main(String[] args) {

        Player player = new Player("Muldoko");
        Player player1=new Player("Minak Jinggo");
        // player.baseHealth; karena di-private ini tak bisa di compile
        Weapon weapon1 = new Weapon("Paser Loro",18);
        Armor armor1 = new Armor("Kutang Wojo",16,399);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.display(); // sebelum level up
        player1.levelUp();// setelah level up
        player1.levelUp();
        player1.levelUp();
        player1.display(); //< == line ini
        //player.baseHealth = 0; tetep gak bisa, harus buatkan fungsi yang public
        Weapon weapon = new Weapon("tepel Manunggal", 21);
        Armor armor = new Armor("rasuk Wojo",9,666);

        player.setWeapon(weapon);
        player.setArmor(armor);
        player.display();
        player.levelUp();
        player.display();
        // coba lij=hat hasil perubahan

        // PR : coba bikin saling serang, saat player (A) menyerang player(B) lain,
        // maka A naik satu level

        //PR aku garap seara sederhana belum kompleks.. intinya players saling serang.
        System.out.println("\n DANCOK");
        player.display();
        player1.display();
        player.attacking(player1);
        player1.attacking(player);
        player.display();
        player1.display();
    }
}


