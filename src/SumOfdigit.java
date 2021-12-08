import java.util.Scanner;

public class SumOfdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;


        }
        System.out.print("the sum of digit" + temp + " is " + sum);

    }
}
