package  com.tutorial;
class Display{
    // variable atau atribut yang bersifat static maka nilainya akan di sharing ke semua object
    // bahkan di class ==> ini bisa disebut jiga  class variable, variable yang diam dan nilainya terdapat pada semuanya
    // jika satu atribut pada object atau class bahkan, jika di re-assign maka nilainya semua berubah.. sesuai dengan yang diubah
    public static String type = "display";
    private String name;
    Display(String name){
        this.name = name ;
    }
    void show(){
        System.out.println("Nama : "+this.name);
    }
    void setType(String typeInput){
        //type = typeInput; // alternatif 1 ,pemanggilan bisa pakai cara lain, jika ini kita gak tau type punya siapa, ini kebbetulan masih simpel jadi gak ribet
        //this.type = typeInput; // alternatif 2 ,ini lebih jelas siapa pemiliknya, karena this ini merepesentasiakan object saat ini
        Display.type = typeInput; // alternatif 3 , paling recomended klarena meminimalisir keambiguan, sehinga pakai Class bukan object sebagi media re-assign
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println("test");

        Display display = new Display("Aidit");
        display.show();
        Display display1= new Display("Muso");
        display1.show();
        Display display2= new Display("Muso");
        Display display3= new Display("Muso");
        Display display4= new Display("Muso");
        Display display5= new Display("Muso");


        display4.type = "Al Mujahid";// harus nya yang bernilai Al Mujahid cukup display4.type, tapi semua kena share karen bersifat static
        // anda mau re-assign atribut satic bisa pakai object, namun alangkah baiknya jika pakai class, kenapa? , cari di google! wkwk
        // berikut contohnya..
        display2.type = "Muawiyah"; // jika di re-assign maka variable sebelumnya tampak tidak berarti (jadi abu2 seperti mati)
        Display.type = "Al Anshor"; // maka outputnya Al Anshor

        // jika di print maka hasilnya sama yaitu mengikuti reassign yang terakhir,
        // dan bernilai sama karena static itu untuk men-share nilai ke semua object (salah satu metode management memory
        // untuk keperluan tertentu)..

        // menampilkan static atau class variable
        display1.setType("Muawiyah"); // aku coba re-assign lagi, semua output jadi "Muawiyah"
        System.out.println("\n menampilkan static atau class variable");
        System.out.println(display.type);// output "Al Mujahid"
        System.out.println(display1.type);// output "Al Mujahid", jika pada variable pada umumnya (non-static) maka ini tetep bernilai "display"
        System.out.println(display2.type);
        System.out.println(display3.type);
        System.out.println(display4.type);
        System.out.println(display5.type);
        System.out.println("dedengkot : "+Display.type);// ini babonnya, ini bentuk ideal untuuk misal re-assign
    }
}