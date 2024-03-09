package  com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 0;
    }
    // Membuat Getter untukmembaca data yang di private
    public int getIntPrivate(){
        return this.intPrivate;
    }
    public void setIntPrivate(int intPrivate){
        this.intPrivate = intPrivate;
    }
}
class Lingkaran{
    // sebenernya kita bisa mendapat data private, dengan output yang berbeda
    // misal data asli bernilai 10, kita bisa get 5, sesuai kebutuhan, berikut adalah contohnya..
    private double diameter;

    // Getter and setter custom
    double getJari2(){
        return this.diameter/2;
    }
    void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // Getter and setter normal

    double getDiameter() {
        return diameter;
    }

    void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    // getter lingkatan yang di custom berupa produk ukuran multidimensi
    double luas(){
        return 3.14*(this.getJari2()* this.getJari2());
    }
    double keliling(){
        return 3.14*this.diameter;
    }

}
public class Main {
    public static void main(String[] args) {
        // PUBLIC
        // kita bisa akses data yang public

        // berikut kita akan read and write menggunakan public
        Data object = new Data();
        object.intPublic = 20;//write
        System.out.println("Angka Publick   : "+object.intPublic); //read

        // PRIVATE
        // kita hanya bisa mengaksesnya dengan cara mengakali atau memaksanya dengan memasukannya kedalam
        // fungsi yang bersifat public.. untuk Read Only, kita bisa pakai GETTER (sebenernya fungsi ini kita buat sendiri)
        // ..
        // Read by getter
        System.out.println("Angka Private   : "+object.getIntPrivate());
        // Write by setter (write only)
        object.setIntPrivate(99);// tentu ini gak bisa di baca, kecuali anda return
        //ini membaca setelah intPrivate di ubah (setting pakai setter)
        System.out.println("\nsetelah di set  : "+object.getIntPrivate());

        // Read and rwite by Getter and setter custom
        Lingkaran lingkaran = new Lingkaran();
        // setter custom
        lingkaran.setJari2(3);
        // getter Normal
        System.out.println("\nGetter Normal   : "+lingkaran.getDiameter()); // hasil 6

        //setter normal
        lingkaran.setDiameter(10);
        //Getter Custom
        System.out.println("Getter Custom   : "+lingkaran.getJari2()); // hasil 2.5

        // getter lingkatan yang di custom berupa produk ukuran multidimensi
        System.out.println("\nLuas dari diameter  terakhir(10)    : "+lingkaran.luas());
        System.out.println("Keliling dari diameter  terakhir(10): "+lingkaran.keliling()+"\n jari jari "+lingkaran.getJari2() + "\n diameter "+lingkaran.getDiameter() );

        // oke, sekali lagi, selain untuk read and write only dari data yang di private
        // dia juga bisa mengembalikan nilai sesuai kehendak kita, dan  bisam men-set nilai dengan imput namun yang disimpan di memori variabel bernilai berbeda
        // misal kita set 4 tapi yang disimpan 2 atau 8..

    }
}