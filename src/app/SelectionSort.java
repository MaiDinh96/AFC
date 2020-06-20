package app;

import java.util.Scanner;

public class SelectionSort {
    
    void selectionSort(int[] a, int n){
        int i , j , temp, min;
        for ( i = 0; i < n-1; i++) {
            min = i;
            for ( j = i+1; j < n; j++) {
                if( a[j] < a[min]){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort st = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n numbers: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        int i;
        
        for( i =0; i< n; i++){
            System.out.println("Enter i[" + i + "]");
            a[i] = sc.nextInt();
        }

        st.selectionSort(a, n);
        
        for(i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}