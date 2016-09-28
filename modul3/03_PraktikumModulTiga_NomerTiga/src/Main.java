import java.util.Scanner;

/**
 * Created by Kurniawan Yudha on 13/09/2016.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,proses, hasil;
        char c;

        System.out.println("\tKALKULATOR SEDERHANA");
        System.out.println("Daftar Operasi :");
        System.out.println("\t1. Tambah\t[+]");
        System.out.println("\t2. Kurang\t[+]");
        System.out.println("\t3. Kali [*]");
        System.out.println("\t4. Bagi [/]");

        System.out.print("Proses\t: "); proses = scan.nextInt();
        System.out.print("Nilai 1\t: "); a = scan.nextInt();
        System.out.print("Nilai 2\t: "); b = scan.nextInt();

        switch (proses){
            case 1:
                hasil = a+b;
                System.out.println(a+" + "+b+" = "+hasil);
                break;
            case 2:
                hasil = a-b;
                System.out.println(a+" - "+b+" = "+hasil);
                break;
            case 3:
                hasil = a*b;
                System.out.println(a+" * "+b+" = "+hasil);
                break;
            case 4:
                hasil = a/b;
                System.out.println(a+" / "+b+" = "+hasil);
                break;
            default:
                System.out.println("Masukan anda salah!!!");
                break;
        }

    }
}
