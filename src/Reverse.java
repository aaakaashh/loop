import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = 0;

        System.out.print("eneter the number");
        int num = sc.nextInt();
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("the reverse number is" + reverse);
        if (temp== reverse) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
    }

}

