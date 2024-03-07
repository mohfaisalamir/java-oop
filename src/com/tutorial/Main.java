package com.tutorial;

class Book{
    String title;
    String author;
    Book(String judul, String penulis){
        title = judul;
        author= penulis;
    }
    void display(){
        System.out.println("\nJudul Buku  : "+this.title);
        System.out.println("Penulis     : "+this.author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book buku = new Book("Das Kapital","Karl Marx");
        buku.display();
        // menampilkan address
        String addressBook = Integer.toHexString(System.identityHashCode(buku));
        System.out.println(addressBook + " ini adalah alamat memori dari : "+buku.title);

        // assigment object
        Book buku1 = buku;
        // kondisi seperti ini , object baru tidak menduplikat,
        // melainkan mengalatkan memori pada alamat/referensi yang sama
        buku1.display();

        String addressBook1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBook1 + " ini adalah alamat memori dari : "+buku1.title);

        buku1.title = "Manifesto communist";

        System.out.println("\nsetelah perubahan maniferto communist");
        // karena buku1 dan buku memiliki alamat yang sama, maka nilai nya akan mengikuti satu samalain
        buku.display();
        buku1.display();

        fungsi(buku);
        buku.display();
        buku1.display();

    }
    static void fungsi(Book dataBuku){
        // argument yang di lempar (pass by) di sini ini bukan objeck, melainkan reference
        // bagaimanapun juga objek ini merujuk pada objek diatas yang mana akan menuju pada reference yang sama
        // beda halnya dengan data primitif dia akan menduplikat, jika data objek dia akan merujuk ke alamat yang sama
        // maka penting kita harus meng-encapsulation (membungkus dengan pengaman(pengaman yang kita buat sendiri sih sebenernya))..

        String addressBUku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("\n"+addressBUku + " ini adalah alamat memori dari : "+dataBuku.title +" (DALAM FUNGSI)");
        dataBuku.author= "tan malaka";

    }
}