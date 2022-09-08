package projectLab4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;


public class ArrayListQuestion {               //class ArrayListQuestion
	
	
	public interface EvenNumbersInterface //Even Number Interface
	{
		 
		int EvenNumbers(int list);        //method define
    }//end of interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           ArrayList<Integer> list=new ArrayList<>();     //create Array List
          
           Scanner sc=new Scanner(System.in);      //take input from user
           
           System.out.println("if you enter 0 then you will not allowed to add element. ");
           System.out.println("Enter elements of the ArrayList: ");
   		   
           
           int num=Integer.MAX_VALUE;
           
           while(num!=0)       //Check the number is not zero if yes then after not add element in the list.
           {
        	  num=sc.nextInt();
        	  list.add(num);            //Add number in the list.
        	 
           }
           
           //Implemented interface
            Predicate<? super Integer> EvenNumbersFunc = (n ->( n % 2 == 0));    //check Even number 
            
           list.removeIf(EvenNumbersFunc);              //Remove even number
          
       		
           
           if(list.isEmpty())
           {
   			System.out.println("No element is odd present in the entered list");       //print no odd number present in the list.
           }
           else
           {
        	   System.out.println("The odd number is: ");
        	   list.forEach(a->System.out.println(a));       //print odd number
           }
	
	}//end of main
	
}//end of program
