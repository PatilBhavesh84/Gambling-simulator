package com.bridgelabz;

public class GamblingSimulator {
	public static final int PLAYER_BALANCE=100;
	public static final int BET_PER_GAME=1;
	public static final int WON_BET=1;
	public static final int LOST_BET=0;
	public static final int DAYS_PLAYED_MONTH=20;


	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator");

		int amount=DAYS_PLAYED_MONTH*PLAYER_BALANCE;
		int wonLost=0;int day=1; int profit=0; int loss=0;

		while (day<=DAYS_PLAYED_MONTH) {

			int currentBalance=PLAYER_BALANCE;
			while(currentBalance>50 && currentBalance<150) {
				int choice=(int)(Math.random()*10%2);
				switch(choice) {
				case WON_BET:
					currentBalance++;
					break;
				case LOST_BET:
					currentBalance--;
					break;
				}
			}
			if(currentBalance==50) {
				loss++;
			}
			else {
				profit++;
			}
			wonLost=wonLost+currentBalance;
			System.out.println("Day "+day+"Balance "+currentBalance);
day++;
		}
System.out.println("This month player won for "+profit+" times :and lost for "+loss+" times");

	}
}
