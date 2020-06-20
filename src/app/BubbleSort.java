package app;
import java.util.Scanner;

public class BubbleSort {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n numbers: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        int i,j,temp = 0;
        
        for( i =0; i< n; i++){
            System.out.println("Enter i " + i);
            a[i] = sc.nextInt();
        }

        for(i=0; i<n; i++){
            boolean check = true; //boolean must inside for
            for(j = 0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    check = false;
                }
            }
            if(check)
                break;
        }
        
        
        for(i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }

}