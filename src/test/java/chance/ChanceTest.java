package chance;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChanceTest {

    @Test
    public void itShouldReturnProbabilityOfGettingSixWhenRollingOneDice() {
        double expectedProbability = 0.16666666666666666;
        Chance chance = new Chance();
        assertEquals(chance.calculateProbability(), expectedProbability);
    }
}