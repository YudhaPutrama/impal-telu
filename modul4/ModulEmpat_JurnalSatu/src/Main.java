import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        do {
            System.out.println("Maukah Kau menjadi Temanku?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Jawab : ");
            input = in.nextInt();
            if (input==1){
                System.out.println("Terima kasih ^^\n Aku Senang Sekali");
            } else if (input==2){
                System.out.println("Yakin?");
            } else {
                System.out.println("Jawab dong -,-");
            }
            System.out.println();
        } while (input!=1);
    }
}
