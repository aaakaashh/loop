package chapter4;

import java.util.Scanner;

public class Ranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the starting number ");
        int start = sc.nextInt();
        System.out.println("enter the ending number");
        int end = sc.nextInt();
         chosse(start, end);
    }

    public static void chosse(int start, int end) {
        for (int num3 = start; num3 <= end; num3++) {
            if (num3 % 2 == 0) {
                System.out.println(num3);

            }

        }
    }

}




