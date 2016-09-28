package telkom;

import java.util.Scanner;

/**
 * Created by Kurniawan Yudha on 13/09/2016.
 */
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String nama, nim, indeks;
        double tugas, ass1, ass2, ass3, kuis, total;

        nama = "Kurniawan Yudha Putrama";
        nim = "6706161060";

        System.out.println("Nilai Implementasi Algoritma");
        System.out.println("Nama\t\t\t\t\t\t: "+nama);
        System.out.println("NIM\t\t\t\t\t\t\t: "+nim);

        System.out.print("Nilai Tugas\t\t\t(25%)\t: ");
        tugas = scan.nextDouble();

        System.out.print("Nilai Assesment 1\t(15%)\t: ");
        ass1 = scan.nextDouble();

        System.out.print("Nilai Assesment 2\t(20%)\t: ");
        ass2 = scan.nextDouble();

        System.out.print("Nilai Assesment 3\t(30%)\t: ");
        ass3 = scan.nextDouble();

        System.out.print("Nilai Kuis\t\t\t(10%)\t: ");
        kuis = scan.nextDouble();

        total = ((tugas*25)+(ass1*15)+(ass2*20)+(ass3*30)+(kuis*10))/100;
        System.out.println("TOTAL NILAI\t\t\t\t\t: "+total);

        if (total>80.0)
            indeks = "A";
        else if (total>=76)
            indeks = "AB";
        else if (total>=71)
            indeks = "B";
        else if (total>=61)
            indeks = "BC";
        else if (total>=56)
            indeks = "C";
        else if (total>=41)
            indeks = "D";
        else
            indeks = "E";
        System.out.print("INDEKS\t\t\t\t\t\t: "+indeks);
    }
}
