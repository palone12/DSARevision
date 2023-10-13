package Arrays.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] twodArr = new int[3][3];
        for(int i=0 ;i< twodArr.length;i++){
            for(int j=0 ;j< twodArr[i].length;j++){
                System.out.println("Enter Input");
                twodArr[i][j] = sc.nextInt();
            }
        }

        for(int []  a : twodArr){
            System.out.println(Arrays.toString(a));
        }
    }
}
