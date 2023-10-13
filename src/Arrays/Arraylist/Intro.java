package Arrays.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(10);
        for(int i =0 ;i<10;i++){
            int x = sc.nextInt();
            List.add(i,x);
        }

        System.out.println(List);
    }
}
