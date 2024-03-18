package com.terminal;

public class Console { // kenapa public kali ini di tampilkan? ya, kita akan lanjutkan di pembelajaran selanjutnya
    public static void cetak(String mokak){
        System.out.println(mokak);
    }
    public static void log(String pesen){
        System.out.println(pesen);
    }
    public static void print(String message){
        System.out.println(message); // kata kunci message ini tidak secara default ditampilkan sebagai tampilan pembantu,
        // ya mungkin karena ini kosakata message sudah sewajarnya jadi pesan,
        // sehingga tak perlu di peringatkan untuk usser, coba anda lihat di class Main, pasti hanya mokak dan pesen saja yang tampil,
        // tidak dengan message, (info ini gak penting, cuman buat wawsan saja)
    }
}
