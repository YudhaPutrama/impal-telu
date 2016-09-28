import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan Bilangan (1-10)\t: ");
        bilangan = in.nextInt();

        System.out.println(" Bilangan\t| Random Number");
        System.out.println("------------------------------");
        int i=0;
        while (true){
            i++;
            int random = 1 + (int)(Math.random() * ((10 - 1) + 1));
            System.out.print("\t"+bilangan+"\t\t:\t\t"+random);
            if (random==bilangan){
                System.out.print("\tSama!!!\n");
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Bilangan bisa sama besar dengan "+i+" kali perulangan");

    }
}
