package noteproject;

import java.util.Scanner;

public class noteİnfo {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int physic,math,turkish,chemie,music,history,average;
	
	System.out.print("Please give your physic note :");
	physic = input.nextInt();
	
	System.out.print("Please give your math note :");
	math = input.nextInt();
	
	System.out.print("Please give your turkish note :");
	turkish = input.nextInt();
	
	System.out.print("Please give your chemie note :");
	chemie = input.nextInt();
	
	System.out.print("Please give your music note :");
	music = input.nextInt();
	
	System.out.print("Please give your history note :");
    history = input.nextInt();
     
    average = ((physic + math + turkish + chemie + music + history) / 6);
    
    System.out.println("Your average is :" + average + "!");
    
    if(average >= 50) {
    	System.out.println("You succeded !");
    }
 
    
    
         else {
       	System.out.println("You are losed !");
         }
    
    
    if(average <= 100 && average >=85) {
    			System.out.print("Your performance is very good !");
    		}
    else if(average <= 84 && average >= 70) {
    			System.out.print("Your performance is good !");
    		}
    else if(average <= 69 && average >= 50){
    			System.out.print("Your performance is  normal !");
    	}
    
    else {
    		System.out.print("Your performance is bad !");
    	  
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
	}

}
