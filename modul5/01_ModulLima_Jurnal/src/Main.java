import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int awal, akhir, jumlah;

        System.out.print("Masukkan Batas Awal\t\t: ");
        awal = in.nextInt();
        System.out.print("Masukkan Batas Akhir\t: ");
        akhir = in.nextInt();
        jumlah = 0;
        System.out.println("Bilangan Ganjil diantara bilangan "+ awal + " sampai "+ akhir + " adalah \n");
        for (int i=awal; i<=akhir; i++){
            if (i%2==0)
                continue;
            System.out.print(i+", ");
            jumlah++;
        }
        System.out.println("\n");
        System.out.println("Jumlahnya ada "+jumlah+" bilangan");
    }
}
