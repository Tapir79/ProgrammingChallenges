import org.junit.Test;
import problem1.Problem1;

import static org.junit.Assert.*;


public class Problem1Test {

    double[] list = {1, 2, 3};

@Test
public void TestSumWithForLoop(){

    Problem1 tester = new Problem1();
    assertEquals(6,tester.forLoopFunction(list),0.001);

}

@Test
    public void TestSumWithWhileLoop(){
    Problem1 tester = new Problem1();
    assertEquals(6,tester.whileLoopFunction(list),0.001);

}

@Test
    public void TestSumWithRecursion(){
    Problem1 tester = new Problem1();
    assertEquals(6,tester.recursionFunction(list.length,0,list),0.001);
}

}