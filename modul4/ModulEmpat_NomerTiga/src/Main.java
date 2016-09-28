import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username, password;
        int ulang=3;
        boolean logged=false;
        do {
            System.out.println("WELCOME TO D3IF CHAT");
            System.out.println("=============================");
            System.out.println();
            System.out.print("Username\t\t\t: ");
            username = in.nextLine();
            System.out.print("Password\t\t\t: ");
            password = in.nextLine();
            ulang--;
            if (username.equals("yudhaputrama")&& password.equals("6706161060")){
                logged = true;
                break;
            } else {
                System.out.println("Username dan Password Salah");
                System.out.println("Percobaan "+ulang+" kali lagi");
                System.out.println();
            }
        } while (ulang>0);

        if (logged){
            System.out.println("Selamat Anda Berhasil Login");
        } else {
            System.out.println("Anda sudah salah sebanyak 3 kali");
            System.out.println("Coba Lagi Lain Kali");

            System.out.println("Penyusup!!!");
        }
    }
}
