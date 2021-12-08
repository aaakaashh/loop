package chapter4;


import java.sql.SQLOutput;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("eneter the number");
        int num= sc.nextInt();
        String result=check(num);
        System.out.println(  result);

    }
    public static String check(int num){
        int temp= num;
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(temp==reverse){
            return "palindrome";
        }
        else{
            return "not palindrome";
        }



    }
}
