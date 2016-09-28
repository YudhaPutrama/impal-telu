package id.telkom;

public class Main {

    public static void main(String[] args) {
        int waktu, jam, menit, detik;
        waktu = 12654;
        jam = waktu/3600;
        menit = waktu%3600/60;
        detik = waktu%60;
        System.out.println(jam + " jam " + menit + " menit " + detik + " detik");
    }
}
