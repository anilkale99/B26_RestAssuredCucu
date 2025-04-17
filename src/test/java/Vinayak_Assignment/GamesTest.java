package Vinayak_Assignment;

public class GamesTest {

	public static void main(String[] args) {
		
		Games game = new Games();
		game.NumberOfGames();
		
		
		InDoorGame indoor = new InDoorGame();
		indoor.groundAreaRequired();
		indoor.NumberOfGames(); // inherited from Games
		
		OutDoorGames outdoor = new OutDoorGames();
		outdoor.NumberOfGames();//Inherited from Games
		outdoor.OutDoorGames();
		
		Badminton badminton = new Badminton();
		badminton.groundAreaRequired();// inherited from InDoorGame
		badminton.NoOfPlayers(); // Override method
		badminton.NumberOfGames(); //inherited from Games
		badminton.EquipmentRequired();// Specific method of Badminton
		
		Cricket cricket = new Cricket();
		cricket.EquipmentRequired();// Specific method of Cricket
		cricket.NoOfPlayers();// Override method
		cricket.NumberOfGames();//inherited from Games
		cricket.OutDoorGames(); // inherited from OutDoorGames
		
	}

}
