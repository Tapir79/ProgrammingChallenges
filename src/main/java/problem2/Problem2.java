package problem2;

public class Problem2 {

    public int findOne(int[] list) {

        // n = highest number on the list
        int n = list.length + 1;
        System.out.println("Length of the list: " + list.length);

        // Get the total count of numbers
        int sumOfNumbers = n * (n + 1) / 2;

        // subtract all numbers from the sum
        for (int i : list) {
            sumOfNumbers = sumOfNumbers - i;
        }

        // result of the subtraction process is the missing number
        return sumOfNumbers;
    }
}
