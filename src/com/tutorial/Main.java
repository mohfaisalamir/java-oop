package com.tutorial;

import com.print.console;
/*Overload Constructor:

Overload Constructor terjadi ketika sebuah kelas memiliki beberapa konstruktor dengan parameter yang berbeda.
Setiap konstruktor memiliki daftar parameter yang berbeda atau jumlah parameter yang berbeda atau keduanya.
Saat Anda membuat objek dari kelas tersebut, Anda dapat memilih konstruktor yang sesuai dengan kebutuhan Anda berdasarkan parameter yang Anda berikan saat membuat objek tersebut.
Contoh: dalam kelas Player, Anda dapat memiliki beberapa konstruktor yang menerima berbagai macam parameter, seperti Player(String name) dan Player(String name, int age).
Overload Method:

Overload Method terjadi ketika sebuah kelas memiliki beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda.
Metode-metode ini dapat memiliki jumlah parameter yang berbeda, tipe parameter yang berbeda, atau keduanya.
Saat Anda memanggil metode tersebut, pemanggilan metode yang tepat akan dipilih oleh Java berdasarkan argumen yang Anda berikan.
Contoh: dalam kelas Calculator, Anda dapat memiliki beberapa metode add, satu mungkin menerima dua integer, yang lain mungkin menerima dua double, dan yang lain mungkin menerima tiga integer.*/

public class Main{
    public static void main(String[] args) {
        //
        System.out.println("\n oerload pada constructor");
        Player player1= new Player();
        Player player = new Player("Amrullah");
        Player player3= new Player("Hamka");
        Player player2= new Player();

        player.show();
        player1.show();
        player2.show();
        player3.show();
        console.log("\ntai");

        System.out.println("\n oerload pada method");
        // satu fungsi beda cara, atau beda argumen.
        int jumlah = Math.hitung(2,9);
        System.out.println("int : "+jumlah);
        double jumlah1 = Math.hitung2(1.5, 2);
        System.out.println("double int : "+jumlah1);
        double jumlah2 = Math.hitung3(1.2,4.8);
        System.out.println("double double : "+jumlah2);
        String jumlah3 = Math.hitung4("String int : ",12);
        System.out.println(jumlah3);
        String jumlah4 = Math.hitung5("String dan ","String");
    }
}