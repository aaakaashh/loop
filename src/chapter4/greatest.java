package chapter4;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        float num1 = sc.nextFloat();
        System.out.println("enter the second number");
        float num2 = sc.nextFloat();
        System.out.println("enter the third number");
        float num3 = sc.nextFloat();
        float heighest = greates(num1, num2, num3);
        System.out.println("  the highest number is"+heighest);
    }

    public static float greates(float num1, float num2, float num3) {
        float heighest;
        if (num1 < num2 && num2 > num3) {
             heighest = num2;
        }
         else if(num2 < num1 && num1 > num3) {
             heighest = num1;
        }
            else{
                 heighest =num3;
            }

        return heighest;
    }
}

