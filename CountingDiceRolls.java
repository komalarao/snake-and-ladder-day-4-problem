package com.bridgelabz_day4_problem;
import java.util.Random;

public class CountingDiceRolls {

	    public static void main(String[] args) {

	        int position = 0;
	        int DiceRollCount = 0;
	        final int WinningPosition = 100;
	        
	        System.out.println("Initial Position " +position);
	        System.out.println();
	        
	        while(position <= WinningPosition) {
	            Random rand = new Random();
	            int diceValue = rand.nextInt(6)+1;
	            
	            System.out.println();
	            System.out.println("Dice Value is " +diceValue);
	            System.out.println();
	            
	            int option = rand.nextInt(3);
	            DiceRollCount++;
	            
	            if(position == WinningPosition) {
	                System.out.println("you won the game");
	                System.out.println();

	                break;
	            }
	            switch(option) {
	                case 0:
	                    System.out.println("No Play");
	                    break;
	                case 1:
	                    System.out.println("Ladder");
	                    System.out.println();
	                    
	                    position += diceValue;
	                    System.out.println("Current Position is " + position);
	                    System.out.println();

	                    if(position > 100) {
	                        position = position - diceValue;
	                        System.out.println("Current Position is " + position);
	                    }
	                    break;
	                case 2:
	                    System.out.println("Snake");
	                    System.out.println();
	                    
	                    position -= diceValue;
	                    System.out.println("Current Position is " + position);
	                    System.out.println();

	                    if(position < 0) {
	                        position = 0;
	                        System.out.println("Current Position is " + position);
	                    }
	                    break;
	                default:
	                    System.out.println("Not Correct");
	                    System.out.println();
	            }
	            System.out.println("Dice Roll Count "+DiceRollCount);

	        }
	    }
}
