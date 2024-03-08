package  com.tutorial;
class Player{
    private String nama;   // (tanpa access modifier (Privat, oblick or other)) ini default,
    // artinya dia bisa dibaca dab bisa ditulis kapanpun.
    public int umur; // public, bisa dibaca dan ditulis di luar kelas
    private int health; // private, hanya bisa diakses di dalam kelas saja ,
    // jika dipakasa maka gagal compiling alias error


    public Player(String nama, int umur, int health) {
        this.nama = nama;
        this.umur = umur;
        this.health = health;
    }
    void display(){
        // apapun yang diprivate seperti fungsi setHealth(), maka hanya bisa diakases didalam kelas seperti berikut
        setHealth();
        System.out.println("\nNama      : "+this.nama);
        System.out.println("Umur        : "+this.umur);
        System.out.println("Kesehatan   : "+this.health); //karena private
        // maka dia hanya bisa diakases di sini (didalam kelas Player) ,

    }
    public void getName(String nama){
        this.nama = nama;
    }
    // sekarang kita coba mem-privat-kan method (jadi ya hanya bisa dipakai di dalam kelas)
     private void setHealth(){
        this.health += 200;
    }

}
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Marnox",34,22);
        player.display();

        //DEFAULT
//        System.out.println(player.nama); // membaca data
//        player.nama = "Surtix"; // menulis data
//        System.out.println(player.nama); // membaca data
        // ini ketika player.name dipaksa, maka dia gagal compile, karena property "String name" di ubah menjadi prrivate

        //PUBLIC
        System.out.println(player.umur); // membaca data
        player.umur = 33; // menulis data
        //player.health = 12; error==> tidak bisa di compile
        System.out.println(player.umur); // membaca data
        //System.out.println(player.health); error==> tidak bisa di compile
        player.display(); // meskipun didalam display() terdapa atribut Private,
        // namun sifatnya akan mengikuti fungsi yang membawanya
        player.getName("Muldoko");// kendati, property di ganti Private, dia tetap bisa diakses (nanti kita belajar enkapsulasi)
        player.display();

        //player.setHealth();// gagal compile karena function saya ubah menjadi private, sehingga hanya bisa di pakai di dalam kelasnya saja..



    }
}