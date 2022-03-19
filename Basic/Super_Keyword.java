/*
Concept :- Super Keyword in Java

1) super keyword used to access base class paramertic constructor. by super(a,b);
2) super is used to access value of base class variable , which is common in both classes ,
 by  super.variable_name (example :- super.a ); i.e should be protected in base class
3) If we have overriden method in derived class , we can call to base class method by super.method (example:- super.calculation)


*/



class Test1{
   protected int a,b;
    String name="Test1 varaible";
    Test1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor of base class "+name);
    }
    void calculation(){
        int res=0;
        res=a+b;
        System.out.println("base class result "+res);
    }
}

class Test2 extends Test1{
    String name ="Test2 variable";
    int a,b,c;
    Test2(int a,int b,int c){
        super(a,b);
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Constructor of Derived class "+name);
    }
    void calculation(){
        super.calculation();
        System.out.println("Derived class result "+(super.a+b+c));
    }
}



public class Super_Keyword {
    public static void main(String[] args) {
        Test2 t1 = new Test2(1,2,3);
        t1.calculation();
    }
}
