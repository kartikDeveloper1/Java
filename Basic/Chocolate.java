/*
Problem :- How to use Constructor in java 
In the constructor initialize the variables, barCode, name, weight and cost, according to the table given below:
Use getter and setter methods to get and set values of instance variables.
*/





public class Chocolate {

    int barCode,weight,cost;
    String name;

    Chocolate(int barCode,int weight,int cost,String name){
        this.barCode=barCode;
        this.weight=weight;
        this.cost=cost;
        this.name=name;
    }

    public int getBarCode() {
        return barCode;
    }
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost=cost;
    }

    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Chocolate c=new Chocolate(101,12,10,"Cadbury");
        System.out.println("Chocolate Name "+c.getName());
        System.out.println("Weight "+c.getWeight());
        System.out.println("Cost "+c.getCost());
        System.out.println("BarCode "+c.getBarCode());
    }    
}
