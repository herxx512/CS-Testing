import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {
    private int[] missingLowest = {2,3,4,5,6,7,8,9,10};
    private int[] missingMiddle = {1,2,3,4,6,7,8,9,10};
    private int[] missingHighest= {1,2,3,4,5,6,7,8,9};
    private MissingNumber missNum = new MissingNumber();

    @Test
    public void testMissing_Lowest(){
        assertEquals(1, missNum.missingNumberSum(missingLowest,10));
    }

    @Test
    public void testMissing_Middle(){
        assertEquals(5, missNum.missingNumberSum(missingMiddle,10));
    }

    @Test
    public void testMissing_Highest(){
        assertEquals(10, missNum.missingNumberSum(missingHighest,10));
    }
}