public class Worker implements Runnable {
    private int mazeSize;

    public Worker(int mazeSize) {
        //creating a runnable worker
        this.mazeSize = mazeSize;

    }


    @Override
    public void run() {

        int passCase = 0;
        //generating a random maze
        int[][] maze = MazeGenerator.Generate(mazeSize);

        MazeSolve mazeSolve = new MazeSolve(maze);

        //going from (0,0) to (19,19) of the randomly generated array
        if (mazeSolve.findPath(0, 0, mazeSize - 1, mazeSize - 1)) {
            passCase++; //passed mazes
        }
        MonteCarlo.setPassCases(passCase); //setting the passed maze count
    }
}
