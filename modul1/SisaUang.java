package paket1;

import java.util.Scanner;

/**
 * Created by Yudha Putrama on 8/30/2016.
 */
public class SisaUang {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int uang, pecahan, sisa;
        System.out.print("Inputkan Mata uang : ");
        uang = reader.nextInt();
        pecahan = uang/2000;
        sisa = uang % 2000;
        System.out.println("Pecahan Uang 2000 sebanyak : "+ pecahan);
        System.out.println("Susa Uang : "+ sisa);
    }
}
