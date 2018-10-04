package problem5;

public class Problem5Swap2Varibles {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        swapVariablesWithTemp(a, b);

        a = 3;
        b = 5;

        swapVariableWithoutTemp(a, b);

    }

    private static void swapVariablesWithTemp(int a, int b) {

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

    private static void swapVariableWithoutTemp(int a, int b) {

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        a = a + b; // sum of both
        b = a - b; // sum of both - b = former a
        a = a - b; // sum of both - former a = former b

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}

