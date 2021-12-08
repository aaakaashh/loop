package Array;

import java.util.Scanner;

public class Found {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[1] = sc.nextInt();
        }
        System.out.println("enter the search value ");
        int search = sc.nextInt();
        for (int i = 0; i < array.length; i++) {

            if (search == array[i]) {
                System.out.println("it is found");
                flag = true;
                break;
            }

            if (flag) {
                System.out.println("it is found");

            } else {
                System.out.println("it is not found");

            }
        }
    }
}