import java.util.Scanner;

public class NomerEmpat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;
        String hasil;
        System.out.print("Masukkan angka : ");
        angka = scan.nextInt();
        hasil = (angka%2==0)?"Genap":"Ganjil";
        System.out.println("Angka "+angka+" adalah angka "+hasil);
    }
}
