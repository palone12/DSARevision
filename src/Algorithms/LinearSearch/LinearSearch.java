package Algorithms.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the Target");
        int target=sc.nextInt();
        System.out.println("Found at " + LinearSearchAlgo(arr,target));


    }
    public static int LinearSearchAlgo(int [] arr,int target){
        for(int i =0 ;i< arr.length;i++){
            if(arr[i]==target){
               return i;
            }
        }
        return  0;
    }

}
