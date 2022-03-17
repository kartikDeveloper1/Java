/*
Concept :- Static Polymorphism (METHOD OVERLOADING)
Same Name Method perform different functionality based on passing Parameters.
*/

public class Static_poly {
    //Static Polymorphizm :- Method Overloading

    void msg(){
        System.out.println("This is Method without any Arguments");
    }
    void msg(String a){
        System.out.println("This is Method with Arguments "+a);
    }
    public static void main(String[] args) {
        Static_poly sp=new Static_poly();
        sp.msg();
        sp.msg("Parametric");
    }
}
