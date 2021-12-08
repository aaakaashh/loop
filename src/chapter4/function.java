package chapter4;

import java.util.Scanner;

public class function {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount: ");
        double amount= sc.nextDouble();
        System.out.println("enter the time");
        double time= sc.nextDouble();
        System.out.println("enter the rate");
        double rate= sc.nextDouble();
        double result=simpleintrest(amount,  time,rate);
        System.out.println("the simple intrest is "+ result);


    }
    public static double simpleintrest(double amount, double time, double rate){
        double result=(amount*time*rate)/100;
        return result;

    }

}
