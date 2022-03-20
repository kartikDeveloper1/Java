/*
Problem Description: Create a class as per the class diagram given below, to perform the following operations for a list of items with variable length.

Display all the items on the list.
Find the maximum value from the list.
Sort the list in ascending order.
Find the average of all the items on the list.

-----------------------------------------------
Input :- 5,8,2,1

-----------------------------------------------
Output:-
5
8
2
1
Maximum Item 8
Average of List Items 4.0
1
2
5
8
----------------------------------------------
*/


public class VariableArgument {
    int value[];

    void setItems(int... a){           //Variable length Arguments work like Arrays internally in java.
        value=new int[a.length];
        for(int i=0;i<a.length;i++){
            value[i]=a[i];
        }
    }
    void displayItems(){
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]);
        }
    }
    void maxItem(){
        int l;
        l=value[0];
        for(int i=1;i<value.length;i++){
            if(l<value[i]){
                l=value[i];
            }
        }
        System.out.println("Maximum Item "+l);
    }

    void findAvg(){
        float s=0;
        for(int i=0;i<value.length;i++){
            s+=value[i];
        }
        System.out.println("Average of List Items "+(s/value.length));
    }
    void sortingItems(){
        for(int i=0;i<value.length;i++){
            for(int j=i+1;j<value.length;j++){
                if(value[i]>value[j]){
                    int temp=value[i];
                    value[i]=value[j];
                    value[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        VariableArgument v = new VariableArgument();
        v.setItems(5,8,2,1);
        v.displayItems();  //Display List Items
        v.maxItem();       // Max element from list
        v.findAvg();       // calculate  Average 
        v.sortingItems();  // Sort items in Ascending order
        v.displayItems(); 
    }    
}
