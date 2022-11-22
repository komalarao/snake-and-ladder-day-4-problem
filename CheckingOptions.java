package com.bridgelabz_day4_problem;
import java.util.Random;

public class CheckingOptions {
	    public static void main(String[] args) {

	        
	        int position = 0;
	        
	        Random rand = new Random();
	        int diceValue = rand.nextInt(6) + 1;
	        
	        System.out.println("Dice Value is " + diceValue);

	        
	        int option = rand.nextInt(3);
	        if (option == 0) {
	        	
	            System.out.println("No Play");
	        } else if (option == 1) {
	        	
	            System.out.println("Ladder");
	            
	            position =position+ diceValue;
	            System.out.println("Current Position is " + position);
	            
	        } else {
	            System.out.println("Snake");
	            
	            position = position-diceValue;
	            System.out.println("Current Position is " + position);
	        }
	    }

}
