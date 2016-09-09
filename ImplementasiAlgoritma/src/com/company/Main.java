package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int jmasuk,mmasuk, jkeluar, mkeluar, lamaJam, lamaMenit;
//        System.out.print("Jam Masuknya : ");
//        jmasuk = sc.nextInt();
//        mmasuk = sc.nextInt();
//        System.out.print("Jam Keluarnya : ");
//        jkeluar = sc.nextInt();
//        mkeluar = sc.nextInt();
//        lamaJam = jkeluar-jmasuk;
//        lamaMenit = mkeluar-mmasuk;
//        if (mkeluar<mmasuk){
//            lamaJam -=1;
//            lamaMenit +=60;
//        }
//        System.out.println("Lama Pakir = "+lamaJam+" jam "+ lamaMenit + " menit");
//
//        System.out.print("Masukkan nomer hari : ");
//        int no = sc.nextInt();
//        switch (no) {
//            case 1:
//                System.out.println("Hari ke-"+no+" adalah hari Senin");
//                break;
//            case 2:
//                System.out.println("Hari ke-"+no+" adalah hari Selasa");
//                break;
//            case 3:
//                System.out.println("Hari ke-"+no+" adalah hari Rabu");
//                break;
//            case 4:
//                System.out.println("Hari ke-"+no+" adalah hari Kamis");
//                break;
//            case 5:
//                System.out.println("Hari ke-"+no+" adalah hari Jumat");
//                break;
//            case 6:
//                System.out.println("Hari ke-"+no+" adalah hari Sabtu");
//                break;
//            case 7:
//                System.out.println("Hari ke-"+no+" adalah hari Minggu");
//                break;
//            default:
//                System.out.println("Nomer yang anda masukkan salah");
//        }
        int a,b,c;
        System.out.print("Masukkan tiga bilangan : ");
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        int max;
        if (a>b && a>c)
            System.out.println("Bilangan terbesarnya = "+a);
        else if (b>c)
            System.out.println("Bilangan terbesarnya = "+b);
        else
            System.out.println("Bilangan terbesarnya = "+c);
    }
}
