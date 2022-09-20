package com.bridgelabz.day4.UC_SnakeLadderProblem;

import java.util.*;
public class SnakeLadder {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Snake & Ladder Simulator");
		System.out.println();
		int Singleplayer=0;
		System.out.println("Starting position of Single Player is: "+Singleplayer);
		int SingleplayerRolls= random.nextInt(6)+1;
		System.out.println("The Player rolls the die & get a number: "+SingleplayerRolls);
	}

}
