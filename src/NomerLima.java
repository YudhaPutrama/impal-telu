import java.util.Scanner;

/**
 * Created by Kurniawan Yudha on 11/09/2016.
 */
public class NomerLima {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nama, nip, bank, jabatan;
        int jAnak,jGaji,jTunjang,tGaji;

        System.out.print("Nama\t\t\t: ");
        nama = scan.nextLine();
        System.out.print("NIP\t\t\t\t: ");
        nip = scan.nextLine();
        System.out.print("Jabatan\t\t\t: ");
        jabatan = scan.next();
        System.out.print("Jumlah anak\t\t: ");
        jAnak = scan.nextInt();

        switch (jabatan){
            case "Manajer": jGaji = 10000000; break;
            case "Supervisor": jGaji = 8500000; break;
            case "Kepala Cabang": jGaji = 7700000; break;
            case "Staff": jGaji = 6850000; break;
            case "Marketing": jGaji = 5780000; break;
            default: jGaji = 0;
        }

        if (jAnak==1)
            jTunjang = jGaji*5/100;
        else if(jAnak==2)
            jTunjang = jGaji*10/100;
        else if(jAnak>2)
            jTunjang = jGaji*20/100;
        else
            jTunjang = 0;

        tGaji = jGaji + jTunjang;

        if (tGaji<=6000000)
            bank = "BTN";
        else if (tGaji<=7000000)
            bank = "BRI";
        else if (tGaji<=8500000)
            bank = "MANDIRI";
        else if (tGaji<=10000000)
            bank = "BNI";
        else if (tGaji>10000000)
            bank = "BCA";
        else
            bank = "";

        System.out.println("Gaji\t\t\t: "+jGaji);
        System.out.println("Tunjangan\t\t: "+jTunjang);
        System.out.println("Total gaji anda adalah\t: "+tGaji);
        System.out.println("Silagkan ambil uang di bank "+ bank);

    }
}
