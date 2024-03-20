package com.tutorial;

import java.util.Scanner;

public class Mainan {
    public static void main(String[] args) { // solusi soal hackkerank
        while (true){
            Scanner scanner     = new Scanner(System.in);
            System.out.println("Masukan jenis kendaraan   1/2  : ");
            int inputVihecels   = scanner.nextInt();
            System.out.println("Masukan waktu 1-24 (jam)");
            int inputHour       = scanner.nextInt();
            int totalPembayaran = 0;

            if (inputVihecels == 1 && (inputHour >=1 && inputHour<=24 )){
                totalPembayaran = 2000 + ((inputHour-1)*1000);
            }if (inputVihecels==2 && (inputHour >=1 && inputHour<=24 )) {
                totalPembayaran = 1000 + ((inputHour-1)*500);
            }else {
                System.out.println("Inputan antum berlebihan");
            }

            System.out.println(totalPembayaran);
        }

    }
}
