package com.tutorial;

//class tanpa constructor / class polos
class Polos {
    String dataString;
    Integer dataInteger;
}
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    Mahasiswa(String inputNAma, String inputNIM, String inputJurusan){
        //adalah fungsi Baawaan(sebenrnya), yang dipanggil pertamakali ketika Objek Dibuat
        nama=inputNAma;
        NIM=inputNIM;
        jurusan=inputJurusan;
        System.out.println("Ini adalah Condtructor");
    }

    @Override
    public String toString() {
        return "Mahasiswa{\n" +
                "nama='" + nama + '\'' +
                ", \nNIM='" + NIM + '\'' +
                ", \njurusan='" + jurusan + '\'' +
                '}';
    }
}

public class Main {
        public static void main(String[] args) throws Exception {
//            Polos objectPolos = new Polos();
//        objectPolos.dataString="diancok";
//        objectPolos.dataInteger=20;
//
//            Polos polos = new Polos();
//        polos.dataString="PKI Jancok";
//        polos.dataInteger=30;
//            System.out.println(polos.dataString);
//            System.out.println(polos.dataInteger);
//            System.out.println(objectPolos.dataString);
//            System.out.println(objectPolos.dataInteger);
            Mahasiswa mahasiswa = new Mahasiswa("Gatel","900011","Kimia");
            System.out.println(mahasiswa.toString());
            }

        }

