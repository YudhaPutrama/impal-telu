package id.telkom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fah, kel, rea, cel;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Suhu dalam Celsius : ");
        cel = scanner.nextDouble();
        System.out.println("Hasil :");
        //Rumus
        fah = ((9/5.0)*cel)+32.0;
        kel = cel+273.0;
        rea = (4.0/5.0)*cel;
        //Output
        System.out.println("Fahrenheit = "+fah);
        System.out.println("Kelvin = "+kel);
        System.out.println("Reamu = "+rea);
    }
}
