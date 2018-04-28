import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MazeGeneratorTest {
    private static MazeGenerator mazeGenerator;


    @Test
    public void mazeGenerate() {
        int size = new Random().nextInt(20) + 2;
        int[][] maze = mazeGenerator.Generate(size);

        assertEquals(0, maze[0][0]);
        assertEquals(0, maze[size - 1][size - 1]);
    }
}
