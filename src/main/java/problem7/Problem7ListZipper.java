/*
Write a function that combines two lists by alternatingly taking elements.
For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].

 */

package problem7;

public class Problem7ListZipper {

    public static void main(String[] args) {

        int length = 0;
        String[] listA = {"a", "b", "c"};
        String[] listB = {"1", "2", "3"};
        String[] listCombined = new String[listA.length + listB.length];


        if (listA.length > listB.length) {
            length = listA.length;
        } else {
            length = listB.length;
        }

        int i = 0;
        int j = 0;
        while (j < listCombined.length) {

            listCombined[j] = listA[i];
            listCombined[j + 1] = listB[i];

            i++;
            j = j + 2;
        }

        for (int k = 0; k < listCombined.length; k++) {
            System.out.println(listCombined[k]);
        }
    }
}
