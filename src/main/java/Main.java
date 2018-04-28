public class Main {
    public static void main(String[] args) {
        //creating object
        MonteCarlo monteCarlo = new MonteCarlo(20, 10000);
        //printing available processors
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
        //calculating
        monteCarlo.CalculateMonte();

        //printing
        System.out.println("Total Cases: " + monteCarlo.getTotalCases());
        System.out.println("Pass Cases: " + MonteCarlo.getPassCases());
        System.out.println("Probability: " + monteCarlo.getProbability());
    }
}
