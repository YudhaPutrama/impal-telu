import java.util.Scanner;

/**
 * Created by Kurniawan Yudha on 13/09/2016.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String bank, jabatan;
        int jumlahAnak,jumlahGaji,jumlahTunjangan,totalGaji;

        System.out.println("Nama\t\t\t: Kurniawan Yudha Putrama");
        System.out.println("NIP\t\t\t\t: 6706161060");
        System.out.print("Jabatan\t\t\t: "); jabatan = scan.next();
        System.out.print("Jumlah anak\t\t: "); jumlahAnak = scan.nextInt();

        switch (jabatan){
            case "Manajer": jumlahGaji = 10000000; break;
            case "Supervisor": jumlahGaji = 8500000; break;
            case "Kepala Cabang": jumlahGaji = 7700000; break;
            case "Staff": jumlahGaji = 6850000; break;
            case "Marketing": jumlahGaji = 5780000; break;
            default: jumlahGaji = 0;
        }

        if (jumlahAnak==1)
            jumlahTunjangan = jumlahGaji*5/100;
        else if(jumlahAnak==2)
            jumlahTunjangan = jumlahGaji*10/100;
        else if(jumlahAnak>2)
            jumlahTunjangan = jumlahGaji*20/100;
        else
            jumlahTunjangan = 0;
        totalGaji = jumlahGaji + jumlahTunjangan;

        if (totalGaji<=6000000)
            bank = "BTN";
        else if (totalGaji<=7000000)
            bank = "BRI";
        else if (totalGaji<=8500000)
            bank = "MANDIRI";
        else if (totalGaji<=10000000)
            bank = "BNI";
        else if (totalGaji>10000000)
            bank = "BCA";
        else
            bank = "";

        System.out.println("Gaji\t\t\t: "+jumlahGaji);
        System.out.println("Tunjangan\t\t: "+jumlahTunjangan);
        System.out.println("Total gaji anda adalah\t: "+totalGaji);
        System.out.println("Silahkan ambil uang di bank "+ bank);
    }
}
