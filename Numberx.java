package Assignment.Operator;

import java.util.Scanner;

public class Numberx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        x+=8;
        x/=3;
        x%=5;
        x*=5;
        System.out.println(x);
    }
}
