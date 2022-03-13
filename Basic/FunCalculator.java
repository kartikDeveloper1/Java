/*
Problem Description: Create a class FunCalculator which calculates an Armstrong number and a lucky number. 
An Armstrong number is one in which the sum of the cube of the digits of a number results in the number itself. 
A lucky number is a number where the sum of squares of every even positioned digit (starting from the second position) is a multiple of 9.


Input :-
  Case 1:- Armstrong or not ?
      number=153
      output:-153 Armstrong
      
  Case 2:-number is Lucky or not ?
      number=1623
      output:- 1623 is Lucky Number
    

*/

import java.util.Scanner;
public class FunCalculator {
   public static void main(String[] args) {
       int m,number=153,r,choice,cube=0;
       Scanner s=new Scanner(System.in);
       System.out.print("enter Choice ");
       choice=s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter number ");
                number=s.nextInt();
                m=number;
                while(number>0){
                    r=number%10;
                    cube+=r*r*r;
                    number=number/10;
                }
                if(m==cube){
                    System.out.println(number+" Armstrong");
                }else{
                    System.out.println(number+" Not Armstrong");
                }
                break;
            case 2:
                System.out.println("Enter number ");
                number=s.nextInt();
                String num2=Integer.toString(number);
                String[] arr = num2.split("");
                int total=0;
                for(int i=0;i<arr.length;i++){
                    int index=i+1;
                    if(index%2==0){
                        int square=(Integer.parseInt(arr[i])*Integer.parseInt(arr[i]));
                        total+=square;
                    }
                }
                if(total%9==0){
                    System.out.println(number+" is Lucky Number ");
                }else{
                    System.out.println(number+" is not Lucky Number ");
                }
                break;
            default:
                System.out.println("Invalid Choice");

        }
        
   }
}
