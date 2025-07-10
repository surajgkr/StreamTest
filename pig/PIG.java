package com.aurionpro.pig;

import java.util.Random;
import java.util.Scanner;

public class PIG {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        String decision = "c";
			do {
	        int totalScore = 0;
	        int maxTurns = 5;

	        for (int turn = 1; turn <= maxTurns; turn++) {
	            System.out.println("\nTURN " + turn);
	            int turnScore = 0;
	            boolean continueRolling = true;

	            while (continueRolling) {
	                System.out.print("Roll or hold? (r/h): ");
	                String choice = sc.next().toLowerCase();

	                if (choice.equals("r")) {
	                    int die = rand.nextInt(6) + 1;
	                    System.out.println("Die: " + die);

	                    if (die == 1) {
	                        System.out.println("Rolled a 1! Turn over. No score.");
	                        turnScore = 0;
	                        break;
	                    } else {
	                        turnScore += die;
	                    }
	                } else if (choice.equals("h")) {
	                    totalScore += turnScore;
	                    System.out.println("Score for turn: " + turnScore);
	                    System.out.println("Total score: " + totalScore);
	                    break;
	                } else {
	                    System.out.println("Invalid input. Please enter 'r' or 'h'.");
	                }
	            }

	            if (totalScore >= 20) {
	                System.out.println("\nYou finished in " + turn + " turns!");
	                System.out.println("Game over!");
	                return;
	            }
	        }

	        System.out.println("\nGame over. You did not reach 20 points.");
	        System.out.print("do you want to continue or end (c/e) :");
	        decision = sc.next();
	       
	        
	    }while(decision.equals("c"));
	}
	

	}


