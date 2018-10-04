/*
You are given a list of n-1 integers and these integers are in the range of 1 to n.
There are no duplicates in list. One of the integers is missing in the list.
i.e.
How to find 1 missing number in a sorted Integer Array

 */

package problem2;

public class Problem2MissingNumbers {

    public static void main(String[] args) {
        int[] list = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] list2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        findOne(list);
        findOne(list2);
        findOne(list3);

        // XOR "A or B, but not, A and B" = A ^ B
    }

    private static void findOne(int[] list) {

        // n = highest number on the list
        int n = list.length + 1;
        System.out.println("Length of the list: " + list.length);

        // Get the total count of numbers
        int sumOfNumbers = n * (n + 1) / 2;

        // subtract all numbers from the sum
        for (int i :
                list) {
            sumOfNumbers = sumOfNumbers - i;
        }

        // result is the missing number
        System.out.println(sumOfNumbers);
    }

    /*
    private static void findOneWithXOR(){

    }
    */


    /*
    private static void find2Numbers(){

    }
    */
}