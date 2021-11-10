package mattMitiaguinPacmanTest;
import java.util.Scanner;

public class commands {
	
	private int xGrid;
	private int yGrid;
	private String pacmanFacing;
	
	public commands(int xGrid, int yGrid, String pacmanFacing) {
		this.xGrid = xGrid;
		this.yGrid = yGrid;
		this.pacmanFacing = pacmanFacing;
	}

	// report pacmans position
	public void pacmanReport() {
		System.out.println("Pacman is facing : " + pacmanFacingGet());	
		System.out.println("Pacmans X is : " + xGridGet());
		System.out.println("Pacmans Y is : " + yGridGet());		
	}
	
	// initial call for pacmans placement
	public boolean pacmanInitialPlacement() {
		int xPlace;
		int yPlace;
		boolean xCheck = false;
		boolean yCheck = false;
		String pacmanDirection;
		
		Scanner in = new Scanner(System.in);
		
		// getting X coordinate
		System.out.println("Enter X coordinate (only 0 - 5)");
		String placeX = in.nextLine();
		xPlace = Integer.parseInt(placeX);
		xGridSet(xPlace);
					
		// getting Y coordinate
		System.out.println("Enter a Y coordinate (only 0 - 5)");
		String placeY = in.nextLine();
		yPlace = Integer.parseInt(placeY);
		yGridSet(yPlace);
					
		// setting pacman direction
		System.out.println("Enter a direction e.g. NORTH SOUTH EAST WEST - must be caps");
		String direction = in.nextLine();
		pacmanDirection = direction;
		pacmanFacingSet(pacmanDirection);
		
		// validation for X
		if(xPlace <= 5 && xPlace >= 0) {
			xCheck = true;
		}
		// validation for Y
		if(yPlace <= 5 && yPlace >= 0) {
			yCheck = true;
		}
		
		if(xCheck == true && yCheck == true) {
			return true;
		}
		else {
			System.out.println("You have entered a digit larger than 5 for X or Y");
			return false;
		}	
	}
	
	// same function as above just no validation for X or Y as we want to be able to place pacman outside the grid
	public void pacmanSecondPlacement()
	{
		int xPlace;
		int yPlace;
		String pacmanDirection;
		
		Scanner in = new Scanner(System.in);
		
		// getting X coordinate
		System.out.println("Enter X coordinate (between 0 - 5)");
		String placeX = in.nextLine();
		xPlace = Integer.parseInt(placeX);
		xGridSet(xPlace);
					
		// getting Y coordinate
		System.out.println("Enter a Y coordinate (between 0 - 5)");
		String placeY = in.nextLine();
		yPlace = Integer.parseInt(placeY);
		yGridSet(yPlace);
					
		// setting pacman direction
		System.out.println("Enter a direction e.g. NORTH SOUTH EAST WEST - must be caps");
		String direction = in.nextLine();
		pacmanDirection = direction;
		pacmanFacingSet(pacmanDirection);
	}
	
	// move pacman 
	public boolean pacmanMove(String movement) {
		int xMove;
		int yMove;
		
			if(movement.equals("NORTH")) {
				yMove = yGridGet();
				++yMove;
				if(yMove <= 5 && yMove >= 0 )
				{
					yGridSet(yMove);
					return true;
				}
				else {
					--yMove;
					System.out.println("Pacman hit the wall!");
					System.out.println("Check the REPORT you may have placed him outside the grid!");
					return false;
					
				}
			}
			if(movement.equals("SOUTH")) {
				yMove = yGridGet();
				--yMove;
				if(yMove <= 5 && yMove >= 0 )
				{
					yGridSet(yMove);
					return true;
				}
				else {
					++yMove;
					System.out.println("Pacman hit the wall!");
					System.out.println("Check the REPORT you may have placed him outside the grid!");
					return false;
				}		
			}
			if(movement.equals("EAST")) {
				xMove = xGridGet();
				++xMove;
				if(xMove <= 5 && xMove >= 0 )	
				{
					xGridSet(xMove);
					return true;
				}
				else {
					--xMove;
					System.out.println("Pacman hit the wall!");
					System.out.println("Check the REPORT you may have placed him outside the grid!");
					return false;	
				}						
			}
			if(movement.equals("WEST")) {
				xMove = xGridGet();
				--xMove;
				if(xMove <= 5 && xMove >= 0 )	
				{
					xGridSet(xMove);
					return true;
				}
				else {
					++xMove;
					System.out.println("Pacman hit the wall!");
					System.out.println("Check the REPORT you may have placed him outside the grid!");
					return false;	
				}			
			}
			return true;
	}
	
	
	// turn pacman to the left	
	public void pacmanLeft(String movement) {
		if(movement.equals("NORTH")) {
			pacmanFacingSet("WEST");
		}
		if(movement.equals("SOUTH")) {
			pacmanFacingSet("EAST");
		}
		if(movement.equals("EAST")) {
			pacmanFacingSet("NORTH");
		}
		if(movement.equals("WEST")) {
			pacmanFacingSet("SOUTH");
		}
	}
	
	// turn pacman to the right
	public void pacmanRight(String movement) {
		if(movement.equals("NORTH")) {
			pacmanFacingSet("EAST");
		}
		if(movement.equals("SOUTH")) {
			pacmanFacingSet("WEST");
		}
		if(movement.equals("EAST")) {
			pacmanFacingSet("SOUTH");
		}
		if(movement.equals("WEST")) {
			pacmanFacingSet("NORTH");
		}	
	}
	
	// get variables	
	public int xGridGet() {
		return xGrid;
	}
	
	public int yGridGet() {
		return yGrid;
	}
	
	public String pacmanFacingGet() {
		return pacmanFacing;
	}
	
	// set variables
	public void xGridSet(int xGrid) {
		this.xGrid = xGrid;
	}
	
	public void yGridSet(int yGrid) {
		this.yGrid = yGrid;
	}
	
	public void pacmanFacingSet(String pacmanFacing) {
		this.pacmanFacing = pacmanFacing;
	}
}
