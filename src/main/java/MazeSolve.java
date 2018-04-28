import java.util.Stack;

public class MazeSolve {

    private int[][] maze;
    private Stack<Path> stack;

    public MazeSolve(int[][] maze) {
        this.maze = maze;

        //saving solved path in stack
        stack = new Stack<>();
    }

    public void show() {
        for (int i = 0; i < maze.length; i++) {
            System.out.printf("{");
            for (int j = 0; j < maze[i].length; j++)
                System.out.printf("%d%s", maze[i][j],
                        j != maze[i].length - 1 ? ", " : " }\n");
        }
    }


    public boolean findPath(int x, int y, int X, int Y) {
        //checking whether point has been found
        if (x == X && y == Y) {
            stack.push(new Path(x, y));
            return true;
        }
        //checking there is a wall or prev walked path
        if (maze[x][y] == 1 || maze[x][y] == 2) {
            //was here or wall
            return false;
        }

        //setting tried path
        maze[x][y] = 2;

        //checking boundary
        if (x != 0) {
            if (findPath(x - 1, y, X, Y)) {
                stack.push(new Path(x, y));
                return true;
            }
        }
        if (x != maze.length - 1) {
            if (findPath(x + 1, y, X, Y)) {
                stack.push(new Path(x, y));
                return true;
            }
        }
        if (y != 0) {
            if (findPath(x, y - 1, X, Y)) {
                stack.push(new Path(x, y));
                return true;
            }
        }

        if (y != maze[0].length - 1) {
            if (findPath(x, y + 1, X, Y)) {
                stack.push(new Path(x, y));
                return true;
            }
        }

        return false; //Fix me : NOO!!!!

    }

    public void showPath() {
        System.out.println("Path");
        while (!stack.empty()) {
            Path route = (Path) stack.pop();
            System.out.print(route.getX() + " " + route.getY() + " => ");
        }
    }


}