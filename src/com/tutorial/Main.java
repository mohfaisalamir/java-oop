package com.tutorial;

class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isDie;

    // ini adalah object
    private Armor armor;
    private Weapon weapon;
    public String getName(){
        return this.name;
    }
    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 210;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.level = 1;
        this.isDie = false;

    }


    public  int getHealth(){
        return this.maxHealth()- this.totalDamage;
    }
    public void attack(Player opponent){
        // hitung damage
        int damage = this.getAttackPower();
        //print event
        System.out.println("\n"+this.getName() + " attacking " + opponent.getName() + " with damage "+damage);
        //this. (objek ini) sama dengan opponent, yaitu sama sama merujuk pada kelas yang sama "Player"
        // ruwet, berhubung kelas hanya satu, maka masing2 player bisa mengklaim dan mengubah atribut sesuai kehendak object asing masing
        // ynag idealnya harus memeiliki kelas masing2
        // sekarang player (this) attacking player lainnya (opponent)

        //tiap satuserangnan maka player nambah satu level
        this.levelUp();

        opponent.defence(damage);

    }
    public void defence (int damage){
        //receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.getName() + " defence power "+defencePower);

        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        }else {
            deltaDamage = 0;
        }
        //this.totalDamage = this.totalDamage + deltaDamage;
        //ditulis gini juga boleh
        //ADDING total damage
        this.totalDamage += deltaDamage;
        System.out.println("damage earned is : "+deltaDamage+"\n");
        // checking alive
        if (this.getHealth() <= 0){
            this.isDie = true;
            this.totalDamage = this.maxHealth();
        }
        this.display();
    }
    private int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
    void display(){
        System.out.println("\nPlayer\t\t\t: "+this.name);
        System.out.println("Level\t\t\t: "+this.level);
        System.out.println("Health\t\t\t: "+this.getHealth()+"/"+this.maxHealth());
        System.out.println("Maximum Attack\t: "+this.getAttackPower());
        System.out.println("Is Dead ?\t\t: "+this.isDie+"\n");
        System.out.println("base attack, " +this.baseAttack);
        System.out.println("increament attack, " +this.incrementAttack);
        System.out.println("weapon attack, " +this.weapon.getAttack());
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
        return this.baseHealth +this.level * this.incrementHealth + this.armor.getAddHealth();
    }
    private void levelUp(){
        this.level++;
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
    public  int  getDefencePower(){
        return  this.strength*2;
    }
}
public class Main {
    public static void main(String[] args) {
        // player.baseHealth; karena di-private ini tak bisa di compile
        Player player1=new Player("Minak Jinggo"); //PLAYER 1
        Weapon weapon1 = new Weapon("Paser Wongko",18);
        Armor armor1 = new Armor("Sapu Jagat",16,108);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);


        //player.baseHealth = 0; tetep gak bisa diakses, harus dibuatkan fungsi yang public untuk mengaksesnya
        Player player = new Player("Muldoko"); //PLAYER 2
        Weapon weapon = new Weapon("tepel Manunggal", 21);
        Armor armor = new Armor("rasuk Wojo",9,160);
        player.setWeapon(weapon);
        player.setArmor(armor);

        //tampilkan
        System.out.println("\nKondisi sebelum perang");
        player.display();
        player1.display(); // sebelum level up

        //PERANG
        System.out.println("\nKondisi setelah perang");
        player1.attack(player);
        player.attack(player1);
        player.attack(player1);
        player.attack(player1);
        player.attack(player1);
        player.attack(player1);
        player.display();// muldoko naik 6 level karenya nyerang 6 kali




        //player1.attack(player);
        // player.attack(player);

        // coba lij=hat hasil perubahan

        // PR : coba bikin saling serang, saat player (A) menyerang player(B) lain,
        // maka A naik satu level

        // evaluasi terakhir
        // , karena this. dan opponet berada dalam satu kelas, maka masing2 object dapat mengubah masing2 atribut
        // untuk keamanan ini tidak ideal , penuh kecacatan,
        // nanti akan diperbaiki entah dengan membuat kelas baru sebagai Opponent opponent atau pakai cara yanng lainnya,..
    }
}