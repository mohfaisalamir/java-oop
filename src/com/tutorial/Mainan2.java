package com.tutorial;

import java.util.Scanner;

public class Mainan2 {// solusi II soal hackkerank
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor):");
        int jenisKendaraan = scan.nextInt();

        System.out.println("Masukkan lama waktu parkir dalam jam:");
        int lamaParkir = scan.nextInt();

        int biayaPertamaJam = (jenisKendaraan == 1) ? 2000 : 1000;
        int biayaJamBerikutnya = (jenisKendaraan == 1) ? 1000 : 500;

        // Perhitungan biaya parkir
        int totalBiaya;
        if (lamaParkir == 1) {
            totalBiaya = biayaPertamaJam;
        } else {
            totalBiaya = biayaPertamaJam + (lamaParkir - 1) * biayaJamBerikutnya;
        }

        System.out.println(totalBiaya);
    }
}

