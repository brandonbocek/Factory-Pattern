package Factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args){
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship? (U / R / B)");
		if(userInput.hasNextLine()){
			
			String typeOfShip = userInput.nextLine();
			
		//this line is replacing a lot of code in the main method by moving it to ESFactory
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		if(theEnemy != null){
			doStuffEnemy(theEnemy);
		}else
			System.out.println("Enter a U, R, or B next time.");
		//the factory pattern avoids the code commented out below
		/*
		EnemyShip theEnemy = null;
		
		Scanner userinput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship? (U / R)");
		if(userinput.hasNextLine()){
			
			enemyShipOption = userinput.nextLine();
		}
		if(enemyShipOption.equalsIgnoreCase("U")){
			theEnemy= new UFOEnemyShip();
		}else{
			if(enemyShipOption.equalsIgnoreCase("R")){
				theEnemy= new RocketEnemyShip();
			}
		}
		*/
		
		
		
	}
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
	
}
