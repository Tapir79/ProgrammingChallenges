package problem1;

/*
Write three functions that compute the sum of the numbers in a given list using
a for-loop,
a while-loop,
and recursion.
 */
public class Problem1SumOfNumbers {




    public static void main(String[] args) {

        double[] list = {1, 2, 3};

        System.out.println("list[0]:" + list[0]);
        System.out.println("list[1]:" + list[1]);
        System.out.println("list[2]:" + list[2]);

        double forLoopsum = forLoopFunction(list);
        double whileLoopSum = whileLoopFunction(list);
        double recursionSum = recursionFunction(list.length,0,list);

        System.out.println("recursionsum:"+recursionSum);
    }

    private static double forLoopFunction(double[] list) {

        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        return sum;
    }


    private static double whileLoopFunction(double[] list) {

        int i = 0;
        double sum = 0;

        while (i < list.length) {
            sum = sum + list[i];
            i++;
        }

        return sum;
    }

    /*
    First value of iterations = list.length - 1
     */
    private static double recursionFunction(int iterations, double sum, double[] list) {
        // base case
        if ((iterations -1) == 0) {
            sum = sum + list[iterations - 1];
            return sum;
        } else {
            sum = sum + list[iterations - 1];
            iterations--;
        }
        return  recursionFunction(iterations, sum, list);

    }

}
