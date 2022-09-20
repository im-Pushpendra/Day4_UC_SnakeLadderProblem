package com.bridgelabz.day4.UC_SnakeLadderProblem;

import java.util.*;
public class SnakeLadder {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Snake & Ladder Simulator");
		System.out.println();
		int Singleplayer=0;
		int count=0;
		System.out.println("Starting position of Single Player is: "+Singleplayer);
		
		while(Singleplayer!=100) {
			count++;
			int SingleplayerRolls= random.nextInt(6)+1;
			int a= random.nextInt(3);
			System.out.println();
		System.out.println("The Player rolls the die & get a number: "+SingleplayerRolls);
		if(a==0) {
		System.out.println("No play - stays in the same psition");
		System.out.println("Player current position: "+Singleplayer);
		}		
		if(a==1) {	
			Singleplayer += SingleplayerRolls;
		System.out.println("Gets Ladder & Player moves ahead by number of psition: "+SingleplayerRolls);
		System.out.println("Player current position: "+Singleplayer);
		}
		if(a==2) {	
			Singleplayer -= SingleplayerRolls;
		System.out.println("Snake bytes & Player moves Behind by number of psition: "+"-"+SingleplayerRolls);
			if(Singleplayer<0) {
			Singleplayer =0;
		System.out.println("Player current position: "+Singleplayer);
			}
			else
		System.out.println("Player current position: "+Singleplayer);
		}
	}
		System.out.println();
		System.out.println("Number of times player played: "+count);
	}

}
