package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
			System.out.println("Choose your start amount: ");
			double startAmount = scan.nextDouble();
			System.out.println("Choose your win probability: ");
			double winChance = scan.nextDouble();
			System.out.println("Choose your win limit: ");
			double winLimit = scan.nextDouble();
			
			System.out.println("Choose your total stimulations: ");
			int totalSimulations = scan.nextInt();


		for (int x = 1; x <= totalSimulations; x++)
		{
			//counter
			System.out.print("Simulations" + x);
			while (startAmount < 0 || startAmount < winLimit) //
		
				if (Math.random() < winChance) 
				{
					startAmount++; //win $1 because more number included from 0 to win chance
					System.out.println("WIN");
				}
		
				else
				{
				startAmount--; 
				System.out.println("LOOSE");
				}
		}
	}

}
