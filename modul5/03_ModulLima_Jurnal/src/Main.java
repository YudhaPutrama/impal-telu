import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int nilai, pembagi;
        nilai = 101;
        pembagi = 1;
        System.out.print("Masukkan Bilangan : ");
        nilai = in.nextInt();

        for (int i=2; i<=nilai; i++ ){
            if (nilai%i==0){
                pembagi = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Bilangan terkecil yang habis membagi "+ nilai + " (selain 1) adalah "+ pembagi);
        if (pembagi==nilai)
            System.out.println(nilai + " adalah bilangan prima");
        else
            System.out.println(nilai + " bukan bilangan prima");

    }
}
