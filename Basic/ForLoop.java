/*
How To use For loop in Java with taking input from User by Scanner Class.

*/

import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int start=0,end=0;
        System.out.println("Enter Staring value ");
        start=sc.nextInt();
        System.out.println("Enter Ending value ");
        end=sc.nextInt();

        for(int i=start;i<=end;i++){
            System.out.println("Counting Value "+i);
        }
    }
}
