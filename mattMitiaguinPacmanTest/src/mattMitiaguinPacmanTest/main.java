package mattMitiaguinPacmanTest;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		commands commands = new commands(0,0,"");
		
		System.out.println("Welcome to Pacman");
		System.out.println("This Pacman game runs in a 5x5 Grid!");
		System.out.println("Type in 'exit' to exit");
		
		boolean loopMenu = false;
		boolean initialPacmanPlace = false;
		
		while(!initialPacmanPlace)
		{
			if(commands.pacmanInitialPlacement() == true) {
				System.out.println("Enter next command e.g. MOVE, REPORT, PLACE or EXIT - must be caps");
				initialPacmanPlace = true;		
			}
		}
		
		while (!loopMenu)
		{
			// getting commands from command line
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			System.out.println("Enter next command e.g. MOVE, REPORT, PLACE or EXIT - must be caps");
			
			if(s.equals("MOVE")) {
				String facing = commands.pacmanFacingGet();
				commands.pacmanMove(facing);
			}
			if(s.equals("REPORT"))
			{
				commands.pacmanReport();
			}
			if(s.equals("RIGHT"))
			{
				String direction = commands.pacmanFacingGet();
				commands.pacmanRight(direction);				
			}
			if(s.equals("LEFT")) {
				String direction = commands.pacmanFacingGet();
				commands.pacmanLeft(direction);
			}
			if(s.equals("PLACE")) {
				commands.pacmanInitialPlacement();
			}
			if(s.equals("exit")) {
				loopMenu = true;
			}	
		}	
	}
}
