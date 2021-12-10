package opps;

import java.util.Scanner;

public class Answer_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int[] array=new int[n];
        System.out.println("the integer are: ");
        int sum=0 ;
        for (int i = 1; i <= n; i++) {
            System.out.println(array[i]);
        }
        System.out.println("the sum of number is");
        for (int i = 1; i < n; i++) {
            sum+=array[i];

        }
        System.out.println(sum);

    }
}