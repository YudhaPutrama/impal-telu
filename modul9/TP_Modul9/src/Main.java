import java.util.Scanner;

public class Main {
    static class Pegawai{
        String nama;
        String nik;
        String jabatan;
        String gaji;
    }

    static Scanner in = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {
        int pilihan;
        boolean lanjut=true;
        Pegawai pegawai[] = new Pegawai[10];
        do {
            System.out.println("========================");
            System.out.println("      DATA PEGAWAI      ");
            System.out.println("========================");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Hitung Gaji");
            System.out.println("3. Exit");
            System.out.print("Pilihan : ");
            pilihan = Integer.parseInt(in.nextLine());
            switch (pilihan){
                case 1:
                    pegawai[index] = new Pegawai();
                    tambah(pegawai[index]);
                    break;
                case 2:
                    hitung(pegawai);
                    break;
                case 3:
                    lanjut=false;
                    break;
            }
        } while (lanjut);
        System.out.println("Terima kasih");
    }

    private static void tambah(Pegawai pegawai) {
        if (index==10){
            System.out.println("Sudah mencapai data maksimum\n");
        } else {
            System.out.print("Masukkan Nama\t: ");
            pegawai.nama = in.nextLine();
            System.out.print("Masukkan NIK\t: ");
            pegawai.nik = in.nextLine();
            System.out.println("1. Manager");
            System.out.println("2. HRD");
            System.out.println("3. Karyawan");
            System.out.print("Pilih jabatan\t: ");
            String pilihan = in.nextLine();
            switch (pilihan) {
                case "1":
                    pegawai.jabatan = "Manager";
                    pegawai.gaji = "2000000";
                    break;
                case "2":
                    pegawai.jabatan = "HRD";
                    pegawai.gaji = "1500000";
                    break;
                case "3":
                    pegawai.jabatan = "Karyawan";
                    pegawai.gaji = "1000000";
                    break;
                default:
                    pegawai.jabatan = "";
                    pegawai.gaji = "0";
                    break;
            }
            index++;
            System.out.println();
        }
    }

    private static void hitung(Pegawai[] pegawais) {
        long jumlahGaji=0;
        for (int i=0; i<index; i++){
            System.out.println("--------------------------------");
            System.out.printf(" Data Pegawai ke-%2d\n", i+1);
            System.out.printf(" Nama\t: %s\n",pegawais[i].nama);
            System.out.printf(" NIK\t\t: %s\n",pegawais[i].nik);
            System.out.printf(" Jabatan\t: %s\n",pegawais[i].jabatan);
            System.out.printf(" Gaji\t\t: %s\n",pegawais[i].gaji);
            jumlahGaji+=Long.parseLong(pegawais[i].gaji);
        }
        System.out.println("--------------------------------");
        System.out.println("Jumlah gaji : "+jumlahGaji);
        System.out.println();
    }
}
