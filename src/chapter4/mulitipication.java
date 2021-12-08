package chapter4;

import java.util.Scanner;

public class mulitipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int result = multiplication(num);
        System.out.println("the multiplication table is" + result);
    }


    public static int multiplication(int num) {

        int i;
        for (i = 1; i < 11; i++) {

            System.out.print(num + "*" + i + "=" + (num * i));

        }
        return (num * i);
    }
}

