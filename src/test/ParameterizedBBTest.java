import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedBBTest {

    private String input;
    private boolean expectedOutput;
    DataStructures balance = new DataStructures();

    public ParameterizedBBTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> testConditions(){
        String balanced1 = "(){}[]<>";
        String balanced2 = ")1(2}3{]4[>5<";
        String moreOpen = "{>(1][";
        String moreClose = "(1)]><}";
        String noParens = "";

        Object[][] expectedOutputs = {
                {balanced1, true},
                {balanced2, true},
                {moreOpen, false},
                {moreClose, false},
                {noParens, true}
        };

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testBalancedBrackets(){
        assertEquals(expectedOutput, balance.brackets(input));
    }
}
