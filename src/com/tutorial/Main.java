package com.tutorial;


import com.terminal.Console; // ini harus impor, jika tiddak maka tidak dapat di compile
// untuk file yang masih satu package, maka tidak perlu impor ..

class Main{
    public static void main(String[] args) {
        Player player = new Player("Mustoko");
        Player player1 = new Player("Mukito");
        Player player2 = new Player("Muldoko");
        player.show();
        player1.show();
        player2.show();
        Console.cetak("\nDiancok");
        Console.log("Kok isoooo");// heheh pura pura nge-javaScript, padahal ini Class.funtion
        Console.cetak("mangan");
        Console.log("luwe");
        Console.print("mangan");// ini bukti jika petunjuk "message" tak ditampilkan

    }
}