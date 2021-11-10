package mattMitiaguinPacmanTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pacmanUnitTest {
	
	private commands commandsTest = new commands(2,2,"SOUTH");
	private String directionFacing;

	@Test
	void testMove() {
		directionFacing = commandsTest.pacmanFacingGet();
		commandsTest.pacmanMove(directionFacing);
		assertEquals(2, commandsTest.xGridGet());
		assertEquals(1, commandsTest.yGridGet());
	}
	
	@Test
	void testMoveLeft() {
		directionFacing = commandsTest.pacmanFacingGet();
		commandsTest.pacmanLeft(directionFacing);
		assertEquals("EAST", commandsTest.pacmanFacingGet());
	}
	
	@Test
	void testMoveRight() {
		directionFacing = commandsTest.pacmanFacingGet();
		commandsTest.pacmanRight(directionFacing);
		assertEquals("WEST", commandsTest.pacmanFacingGet());
	}
}
