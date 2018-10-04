package problem8;

import java.util.ArrayList;

public class Problem8Fibonacci {

    public static void main(String[] args) {
        long a = 0L;
        long b = 1L;
        int iteration = 2;
        long[] emptyList = new long[101];
        long[] fibonacciNumbers = new long[101];
        emptyList[0] = 0L;
        emptyList[1] = 1L;
        fibonacciNumbers = fibonacci(a, b, iteration, emptyList);

        fibonacciNoRecursion();
       // fibonacci2(0, 1);

    }


    // previous = 1 , iteration = 1, sum = 0
    private static long[] fibonacci(Long a, Long b, int iteration, long[] numbers) {

        if (iteration >= 100) {
            Long sum = a + b;
            numbers[iteration] = sum;
            return numbers;
        }

        Long sum = a + b;
        numbers[iteration] = sum;
        iteration++;

        return fibonacci(b, sum, iteration, numbers);

    }
    // 0 + 1 = 1
    // 1 + 1 = 2
    // 1 + 2 = 3


    private static void fibonacci2(int a, int b) {
        if (a == 0) {
            System.out.println(0);
            System.out.println(1);
        }

        if (a >= 20) {
            System.out.println("loppu");
        } else {
            int sum = a + b;
            System.out.println(sum);
            fibonacci2(b, sum);
        }
    }

    //0+1=1
    //1+1=2
    //1+2=3
    //2+3=5
    private static void fibonacciNoRecursion(){
        System.out.println(0);
        System.out.println(1);

        int a = 0;
        int b = 1;

        for(int i=0; i< 20; i++){
            int sum = a + b ;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }


}
