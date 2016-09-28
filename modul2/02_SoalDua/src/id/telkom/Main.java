package id.telkom;


public class Main {

    public static void main(String[] args) {
        int nim, jumlah;
        System.out.println("6 digit belakang NIM = 161060");
        nim = 161060;
        jumlah = 0;
        for(int i=0;i<6;i++){
            jumlah+=nim%10;
            nim/=10;
        }

        System.out.println("Hasil = "+jumlah);
    }
}
