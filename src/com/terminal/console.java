package com.terminal;
//public, visibilitas untuk semuanya// gak cuma di Main, tapi semua, misal diakses di Player
public class console {
    public static void log(String pesen){
        System.out.println(pesen);
    } // static method seperti ini hanya akan menempel di dalam class nya, degan kata lain kita bisa akses tanpa membuat class/object nya
    // bisa langsung console.log tanpa membuat class "console console = new consloe()" nya terlebih dahulu  ..
}
 class terminal2 { // tidak boleh ada dua public dalam satu class
     // salah satu harsu devault, tapi kosekuensi defaul dia tak bisa di export ..
     public static void log(String pesen) {
         System.out.println(pesen);
     }
 }
    // kita aka buat lagi semisal ini



