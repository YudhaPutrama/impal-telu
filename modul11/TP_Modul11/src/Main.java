import java.util.Scanner;


public class Main {
    static void garis(){System.out.println("====================");}
    static void println(String s){System.out.println(s);}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        garis();
        println("  Program Ngurutin  ");
        garis();
        System.out.print("Banyak data : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        garis();
        for (int i=0; i<n; i++){
            System.out.printf("Data ke-%d : ", i+1);
            arr[i]=in.nextInt();
        }
        garis();
        println("Belum Urut");
        for (int a : arr) {System.out.print(a+" ");}
        println("");
        garis();
        println("Ascending (Selection Sort)");
        selectionSort(arr);
        tampil(arr);
        System.out.println();
        garis();
        println("Descending (Insertion Sort)");
        insertionSort(arr);
        tampil(arr);
        println("");
        garis();
        println("Selesai!");
    }

    static void selectionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1]<arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    static void tampil(int[] arr){
        for (int a : arr) {System.out.print(a+" ");}
    }
}
