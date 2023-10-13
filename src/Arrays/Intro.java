package Arrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // Decalring Arrays
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for(int i = 0 ; i< arr.length;i++){
            System.out.println("Enter a Value");
           int x = sc.nextInt();
           arr[i]= x;
        }

        // Printing  the array
        for(int i =0 ;i <arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}
