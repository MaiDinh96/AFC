package app;

import java.util.Scanner;

public class Example {
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // int i;
        // for( i =0; i< n; i++){
        //     System.out.println("Enter arr["+i+"]");
        //     arr[i] = sc.nextInt();
        // }
        // for(i = 0;i<n;i++){
        //     arr[i] = arr[i]*arr[i];
        //     System.out.print(arr[i] + " ");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        int i;
        for( i =0; i< n; i++){
            System.out.println("Enter arr["+i+"]");
            arr[i] = sc.nextInt();
        }

        int x,k;
        System.out.print("enter number x: ");
        x = sc.nextInt();
        System.out.print("enter position k: ");
        k = sc.nextInt();

        //ex: 1, 2, 3, 4 and x = 10, k =1
        //a[2] = a[1] = 2
        //a[3] =a[2] but a[2] =2 so a[3] = 2
        //and a[4] also = 2
        // for(i=k+1 ; i<=n ; i++){
        //     arr[i] = arr[i-1];
        // }

        //or n+1 and i>k
        for (i = n ; i >= k+1; i--) {
            arr[i]=arr[i-1];
        }

        //set x to position k
        arr[k] = x;
        //increase size n
        n++;

        for(i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
