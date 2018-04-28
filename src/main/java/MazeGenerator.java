import java.util.Random;

public class MazeGenerator {
    public static int[][] Generate(int size) {
        Random rn = new Random();
        int[][] temp = new int[size][size];

        //generating array
        for (int y = 0; y < temp.length; y++) {
            for (int x = 0; x < temp.length; x++) {
                temp[y][x] = rn.nextInt(2);
            }
        }

        //setting first and last element zero
        temp[0][0] = 0;
        temp[size - 1][size - 1] = 0;
        return temp;
    }
}
