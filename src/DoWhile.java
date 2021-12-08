import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        char choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num= sc.nextInt();
            System.out.print("Enter the  second number: ");
            int num2= sc.nextInt();
            System.out.println("The sum of two number is "+(num+num2));
            System.out.println("Do you want to continue (y/n): ");
            choice= sc.next().toLowerCase().charAt(0);



        }
        while (choice=='y');
    }
}
