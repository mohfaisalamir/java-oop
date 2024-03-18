package com.tutorial;
import  java.util.*;
class Player{
    private static int numberOfPlayer; // jumlah player, static juga bisa digabung dengan acces modifier misal "private"
    private static ArrayList<String> listOfPlayer = new ArrayList<>();
    private String name;
    Player(String name){
        this.name = name;
        //numberOfPlayer++;
        //this.numberOfPlayer++;//juga bisa
        Player.numberOfPlayer++;// recomended
        this.listOfPlayer.add(this.name);
    }
    // bikin method statis
    static ArrayList<String> getName(){
        return Player.listOfPlayer;
    }
    static void shownumberOfPlayer(){ // dan ini jadi getter
        System.out.println("Number of Player = "+Player.numberOfPlayer);
    }
    void setName(String name){
        this.name = name;
    }
    void show(){
        System.out.println("Name : "+this.name );
        System.out.println("punya teman sebanyak "+Player.numberOfPlayer);
    }
}
class Main{
    public static void main(String[] args) {
        Player player = new Player ("Umar");
        Player player1 = new Player ("Usman");
        Player player2 = new Player ("Ali");
        Player player3 = new Player ("Abbas");
        Player player4 = new Player ("Sufyan");
        Player player5 = new Player ("Hindun");
        // untuk mengambik nama nama tersebut ksn susah sehingga perlu dibuat ArrayList (materi kedepan seharusnya)

        player2.show();
        Player.shownumberOfPlayer();
        System.out.println(Player.getName());

    }
}