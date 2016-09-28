import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int bilangan = in.nextInt();

        for (int i=0; i<bilangan/2+1; i++){
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<bilangan-i*2; j++)
                System.out.print("*");
            System.out.println();
        }
//        if (bilangan>0){
//            for (int i=1; i<=bilangan/2;i++)
//                System.out.print(" ");
//            System.out.println("*");
//        }
        for (int i=bilangan/2-1; i>=0; i--){
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<bilangan-i*2; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
