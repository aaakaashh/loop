package Array;

import java.util.Scanner;

public class Arrayfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("enter the element of the arryay:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the entered element are");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("even number are");
        int count = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                count++;
                System.out.println(array[i]);
            } else {
                odd++;

            }
        int sum = 0;
            int average=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average=sum/ array.length;
        }

        System.out.println("number of even number are " + count++);
        System.out.println("number of odd number are " + odd++);
        System.out.println("the sum of number are " + sum);
        System.out.println("the average  of number are " + average);

    }
}


