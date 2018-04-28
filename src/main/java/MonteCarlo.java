import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MonteCarlo {
    private int mazeSize, currentCase = 0, totalCases = 0;
    private static int passCases = 0;
    private double probability = 0;
    private ExecutorService executor;


    public MonteCarlo(int mazeSize, int totalCase) {
        //creating cached threadpool
        executor = Executors.newCachedThreadPool();
        totalCases = totalCase;
        this.mazeSize = mazeSize;
    }

    public boolean CalculateMonte() {

        System.out.println("Finding path from (0,0) to (19,19) from a random Array[20][20]=>");
        System.out.println("Start Calculating...");

        //calculating for all cases
        while (++currentCase < totalCases) {
            //starting a thread and give a maze to solve
            Runnable worker = new Worker(mazeSize);
            executor.execute(worker);
        }
        //waiting for all threads to be shutdown
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Calculation done.");

        probability = (double) passCases / (double) totalCases;

        return true;
    }

    public static synchronized void setPassCases(int passCase) {
        passCases += passCase;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public static int getPassCases() {
        return passCases;
    }

    public double getProbability() {
        return probability;
    }
}
