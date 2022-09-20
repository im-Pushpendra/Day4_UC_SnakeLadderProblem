package com.bridgelabz.day4.UC_SnakeLadderProblem;

import java.util.*;
public class SnakeLadder {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Snake & Ladder Simulator");
		System.out.println();
		int Singleplayer=0;
		System.out.println("Starting position of Single Player is: "+Singleplayer);
		
		while(Singleplayer!=100) {
			int SingleplayerRolls= random.nextInt(6)+1;
			int a= random.nextInt(3);
			System.out.println();
		System.out.println("The Player rolls the die & get a number: "+SingleplayerRolls);
		if(a==0) {
		System.out.println("No play - stays in the same psition");
		}		
		if(a==1) {	
			Singleplayer += SingleplayerRolls;
		System.out.println("Gets Ladder & Player moves ahead by number of psition: "+SingleplayerRolls);
		}
		if(a==2) {	
			Singleplayer -= SingleplayerRolls;
			if(Singleplayer<=0) {
			Singleplayer =0;
			System.out.println("Snake bytes & Player moves Behind by number of psition: "+"-"+SingleplayerRolls);
		}
			else
			System.out.println("Snake bytes & Player moves Behind by number of psition: "+"-"+SingleplayerRolls);
		}
		if(Singleplayer>100) {
			Singleplayer -= SingleplayerRolls;
			System.out.println();
			System.out.println(Singleplayer);
		}
		}
		System.out.println();
		System.out.println("Player Reaches position: "+Singleplayer);
}
}
