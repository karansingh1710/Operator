package Assignment.Operator;

import java.util.Scanner;

public class SumOf3Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        while (N>0){
            int rem=N%10;
            sum+=rem;
            N/=10;
        }
        System.out.println(sum);
    }
}
