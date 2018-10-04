import org.junit.Test;
import problem5.Problem5;
import static org.junit.Assert.*;

public class Problem5Test {


    @Test
    public void TestVaribleSwapWithTempVariable(){

        int a = 5;
        int b = 1;

        Problem5 tester = new Problem5();
        int[] swapped = tester.swapVariablesWithTemp(a,b);

        assertEquals(swapped[0],b);
        assertEquals(swapped[1],a);
    }

    @Test
    public void TestVaribleSwapWithoutTempVariable(){

        int a = 5;
        int b = 1;

        Problem5 tester = new Problem5();
        int[] swapped = tester.swapVariableWithoutTemp(a,b);

        assertEquals(swapped[0],b);
        assertEquals(swapped[1],a);
    }
}
