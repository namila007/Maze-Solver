import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MazeSolveTest {
    private static MazeSolve mazeSolve;
    private static int[][] maze = {{0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1},
            {1, 1, 1, 0, 0}};

    @BeforeClass
    public static void initMazeSolve() {
        mazeSolve = new MazeSolve(maze);
    }

    @Before
    public void beforeTest() {
        System.out.println("Starting Test");
    }

    @After
    public void afterTest() {
        System.out.println("After Test");
    }

    @Test
    public void solveMaze() {
        boolean result = mazeSolve.findPath(0, 0, maze.length - 1, maze[0].length - 1);
        assertEquals(true, result);
    }

}
