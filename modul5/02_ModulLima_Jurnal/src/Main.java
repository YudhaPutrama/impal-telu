import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int tinggi, lebar;
        System.out.print("Masukkan Lebar\t\t: ");
        lebar = in.nextInt();
        System.out.print("Masukkan Tinggi\t\t: ");
        tinggi = in.nextInt();

        System.out.println("\nPersegi Panjang");
        for (int t=1; t<=tinggi; t++){
            for (int l=1; l<=lebar; l++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nPersegi Panjang (outline)");
        for (int t=1; t<=tinggi; t++){
            for (int l=1; l<=lebar; l++){
                if (l==1 || l==lebar || t==1 || t==tinggi)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
