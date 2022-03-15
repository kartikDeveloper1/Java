/*
Concept :- Inheritance
In this Parent class :- Calculation class     /   Child class :- Inherit class

Inherit  class make use of Calculation class variable to implement logic at total() Method.

Input:-10,20
output:- Result 30

*/

class Calculation {
    int a,b;

    void getVar(int a,int b){
        this.a=a;
        this.b=b;
    }
}

class Inherit extends Calculation{

    void Total(){
        System.out.println("Result "+(a+b));
    }
    public static void main(String[] args) {
        Inherit c=new Inherit();
        c.getVar(10, 20);
        c.Total();
    }
}
