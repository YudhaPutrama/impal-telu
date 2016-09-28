import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by Kurniawan Yudha
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noBulan;
        String namaBulan;

        System.out.println("=== PROGRAM CEK BULAN ===");
        System.out.print("Masukan angka : ");
        try {
            noBulan = scan.nextInt();
        }
        catch (InputMismatchException ex){
            //System.out.println("Masukan anda salah!!!");
            noBulan=0;
        }

        switch (noBulan){
            case 1: namaBulan = "Januari"; break;
            case 2: namaBulan = "Februari"; break;
            case 3: namaBulan = "Maret"; break;
            case 4: namaBulan = "April"; break;
            case 5: namaBulan = "Mei"; break;
            case 6: namaBulan = "Juni"; break;
            case 7: namaBulan = "Juli"; break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
            default: namaBulan = null;
        }

        if (namaBulan != null)
            System.out.println("Bulan ke-" +noBulan+ " adalah bulan " + namaBulan);
        else
            System.out.println("Masukan anda salah!!!");
    }
}
