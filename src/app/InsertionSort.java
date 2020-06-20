package app;
import java.util.Scanner;

public class InsertionSort {

    void insertionSort(int[] a, int n){
        int i, pos, value;
        //start with position 1
        for ( i = 1; i < n; i++) {
            //select value to start
            value = a[i];
            //position of value
            pos = i;
            //finding new position for value
            while (pos>0 && a[pos-1] > value) {
                a[pos] = a[pos-1];
                //countdown
                pos--;
            }
            //confused
            a[pos] = value;
        }
    }

    public static void main(String[] args) {
        InsertionSort it = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n numbers: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        int i;
        
        for( i =0; i< n; i++){
            System.out.println("Enter i[" + i + "]");
            a[i] = sc.nextInt();
        }

        it.insertionSort(a, n);
        
        for(i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}