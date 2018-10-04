package problem5;

public class Problem5 {

    public int[] swapVariablesWithTemp(int a, int b) {

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        int temp = a;
        a = b;
        b = temp;

        int[] list = {a,b};

       return list;

    }

    public int[] swapVariableWithoutTemp(int a, int b) {

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        a = a + b; // sum of both
        b = a - b; // sum of both - b = former a
        a = a - b; // sum of both - former a = former b

        int[] list = {a,b};

        return list;
    }
}
