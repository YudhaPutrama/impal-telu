public class Main {

    public static void main(String[] args) {
        int ayam, pergi, sisa;
        ayam = 1000;
        pergi = 100;
        while (ayam>1){
            System.out.println("Tek Kotek Kotek Kotek");
            System.out.print("Anak Ayam Turunlah "+ayam);
            if (ayam>100){
                System.out.println(", Pergi "+pergi+" Tinggalah "+(ayam-pergi));
            } else {
                pergi=99;
                System.out.println(", Pergi "+pergi+" Tinggal Induknya");
            }
            ayam -= pergi;
        }
    }
}
