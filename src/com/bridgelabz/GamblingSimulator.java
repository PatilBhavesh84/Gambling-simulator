package com.bridgelabz;

public class GamblingSimulator {
	public static final int PLAYER_BALANCE=100;
	public static final int BET_PER_GAME=1;
	public static final int WON_BET=1;
	public static final int LOST_BET=0;

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator");
		int currentBalance=PLAYER_BALANCE;

		int choice=(int)(Math.random()*10%2);

		switch(choice) {
		case WON_BET:
			currentBalance++;
			break;

		case LOST_BET:
			currentBalance--;
			break;
		}
		System.out.println("Stake amount:"+currentBalance);
	}
}
