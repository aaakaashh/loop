package Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("enter the element of the arryay:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            }
        System.out.println("maximum:" );


        for (int i = 0; i < array.length; i++)
        if (array[i] > array[i + 1]) {
            System.out.println(array[i]);

            }

        }

    }



