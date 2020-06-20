package app;

import java.util.Scanner;

public class CheckVowel {
    public boolean CheckVowel() {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int n =sc.nextInt();
        int[] ar = new int[n];
        sc.close();

        switch(ch){
            case 'u':
            case 'e':
            case 'i':
            case 'o':
            case 'a':
            case 'U':
            case 'E':
            case 'I':
            case 'A':
            case 'O': check = true;
            System.out.println(ch +" is a vowel");
            break;
            default: check = false;
            System.out.println(ch +" is not a vowel");
        }
        if(check!=true){
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                System.out.println(ch + " is a consonant");
            }else
            System.out.println(ch + " is not a alphabet");
        }

        return check;
    }
    public static void main(String[] args) {
        CheckVowel checkVowel = new CheckVowel();
        checkVowel.CheckVowel();
    }
}