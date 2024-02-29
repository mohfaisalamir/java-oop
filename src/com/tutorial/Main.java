package com.tutorial;
class Mahasiswa { // membuat kelas
    String nama;
    String jurusan;
    String NIM;
    double IPK;
    Integer angkatan;

}
public class Main {
    public static void main(String[] args) {
        // instasnsiasi  / membuat objek

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama      = "Imron Sofyan";
        mahasiswa.NIM       = "3714100036";
        mahasiswa.jurusan   = "Teknik Sipil";
        mahasiswa.IPK       = 2.99;
        mahasiswa.angkatan  = 2011;

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.NIM);
        System.out.println(mahasiswa.jurusan);
        System.out.println(mahasiswa.angkatan);
        System.out.println(mahasiswa.IPK);

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama      = "Abdul Manab";
        mahasiswa1.NIM       = "3714100034";
        mahasiswa1.jurusan   = "Teknik Sipil";
        mahasiswa1.IPK       = 3.67;
        mahasiswa1.angkatan  = 2009;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.angkatan);
        System.out.println(mahasiswa1.IPK);
    }
}