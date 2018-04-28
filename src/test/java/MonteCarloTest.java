import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MonteCarloTest {
    private static MonteCarlo monteCarlo;

    @BeforeClass
    public static void initmonteCarlo() {
        monteCarlo = new MonteCarlo(20, 10000);
    }

    @Test
    public void monteCarlotest() {
        boolean test = false;
        if (monteCarlo.CalculateMonte()) {
            test = true;
        }
        assertTrue(test);
    }
}
