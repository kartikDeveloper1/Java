/*

Problem :- How to Use Increment / Decrement Operator in Java

You have to go from Right To  Left  , and apply operation.

There are 2 Types of Increment / Decrement Operators :-

A) Increment operator :-
    1) Pre-Increment  ++x
    2) Post- Increment x++
    
B) Decrement operator :-
    1) Pre-Decrement  --x
    2) Post- Decrement x--

*/

class Demo{

	public static void main(String[] args){
		int m = 1;
        int n = ++m + m++ + --m + --m;
        System.out.println(n); 
	}
}


/*
Output :- 7
*/
