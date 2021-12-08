package opps;

import java.util.Scanner;

public class Answer_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any natural number");
        int num= sc.nextInt();
        int count,sum=0;
        for(int i=2;i<num;i++){
            count=0;
            for( i=2; i<=num/2;i++){
                if(num%i==0){
                    count++;
                            break;
                }

            }
            if(count==0 && num!=1){
                sum=sum+num;
            }
            System.out.println("the sum of number is "+sum);
        }




    }
}
