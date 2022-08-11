package com.bridgelabz;

public class GamblingSimulator {
	public static final int PLAYER_BALANCE=100;
	public static final int BET_PER_GAME=1;
	public static final int WON_BET=1;
	public static final int LOST_BET=0;
	public static int TOTAL_AMOUNT=0;
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator");
		int currentBalance=PLAYER_BALANCE;

		for(int i=1;i<=20;i++) {
			while (currentBalance>50 && currentBalance<150) {
				int choice=(int)(Math.random()*10%2);

				switch(choice) {
				case WON_BET:
					currentBalance++;
					break;

				case LOST_BET:
					currentBalance--;
					break;
				}
				//	System.out.println("Current Balance::"+currentBalance);
			}
			TOTAL_AMOUNT = TOTAL_AMOUNT +currentBalance;
			System.out.println(TOTAL_AMOUNT);
		}
		System.out.println("The total amount player have after 20 days:"+TOTAL_AMOUNT);
	}
}