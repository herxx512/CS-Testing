import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberPerformanceTest {
    private int[] missingLowest = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] missingMiddle = {1, 2, 3, 4, 6, 7, 8, 9, 10};
    private int[] missingHighest = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int max = 10;
    private MissingNumber missNum = new MissingNumber();

    @Test(timeout = 1000)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i++) {
            missNum.missingNumber(missingLowest, max);
            missNum.missingNumber(missingMiddle, max);
            missNum.missingNumber(missingHighest, max);
        }
    }

    @Test(timeout = 1500)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 1000000; i++) {
            missNum.missingNumberSort(missingLowest, max);
            missNum.missingNumberSort(missingMiddle, max);
            missNum.missingNumberSort(missingHighest, max);
        }
    }

    @Test(timeout = 1000)
    public void testMissingNumberSum_Performance() {
        for (int i = 0; i < 1000000; i++) {
            missNum.missingNumberSum(missingLowest, max);
            missNum.missingNumberSum(missingMiddle, max);
            missNum.missingNumberSum(missingHighest, max);
        }
    }
}