
/*Problem Statement:
1) Objective: Develop a basic Java program to understand class and initialize the instance variable of a class.

  Problem Description: Develop a class "Rectangle". The class should have two instance variables with private access modifier.

  length: int (length is the variable and int is the data type) 
  breadth: int
  
2)
Problem Description: Use the same "Rectangle" class created in the previous exercise of the same module and add a method "calculatePerimeter ()" 
which should calculate the perimeter based on the formula "2(length + breadth)" and prints on the console. 
Develop another class called PerimeterCalculator and add the main method which invokes the "calculatePerimeter ()" method on the Rectangle object.

*/


class Rectangle {
    private int length,breadth;
    
    void setLength(int length){
        this.length=length;
    }
    int getLength(){
        return length;
    }
    void setBreadth(int breadth){
        this.breadth=breadth;
    }
    int getBreadth(){
        return breadth;
    }

    void calculatePerimeter(){
        int Perimeter;
        Perimeter=2*(length+breadth);
        System.out.println("Permineter of Rectangle "+Perimeter);
    }

    
}
public class PerimeterCalculator{
    public static void main(String args[]){
        Rectangle rect= new Rectangle();
        rect.setLength(5);
        rect.setBreadth(5);
        rect.calculatePerimeter();

    }
}
