import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBracketsTest {
    String balanced1 = "(){}[]<>";
    String balanced2 = ")1(}2{]3[>4<";
    String moreOpen = "{>(1][";
    String moreClose = "(1)]><}";
    String noParens = "";

    DataStructures balance = new DataStructures();

    @Test
    public void testBalancedBrackets_balanced1(){
        assertTrue(balance.brackets(balanced1));
    }

    @Test
    public void testBalancedBrackets_balanced2(){
        assertTrue(balance.brackets(balanced2));
    }

    @Test
    public void testBalancedBrackets_moreOpen(){
        assertFalse(balance.brackets(moreOpen));
    }

    @Test
    public void testBalancedBrackets_moreClose(){
        assertFalse(balance.brackets(moreClose));
    }

    @Test
    public void testBalancedBrackets_noParens(){
        assertTrue(balance.brackets(noParens));
    }
}
