import java.util.Scanner;
public class loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting value:");
        int start = sc.nextInt();
        System.out.println("enter the ending value:");
        int end = sc.nextInt();
        int count=0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                 count++;

            }
        }
        System.out.print("the total even number are "+ count);
    }
}
