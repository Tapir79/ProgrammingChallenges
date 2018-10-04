package problem1;

public class Problem1 {

   public double forLoopFunction(double[] list) {

        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        return sum;
    }


   public double whileLoopFunction(double[] list) {

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
    public double recursionFunction(int iterations, double sum, double[] list) {
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
