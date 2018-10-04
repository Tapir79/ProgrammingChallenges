package problem4;

public class Problem4 {

    public int[] findSmallestAndLargest(int[] list) {

        if (list.length == 0) {
            return list;
        } else {
            int smallest = list[0];
            int largest = list[0];

            for (int i : list
                    ) {
                if (i < smallest) {
                    smallest = i;
                }
                if (i > largest) {
                    largest = i;
                }
            }

            int[] smallestAndLargest = {smallest, largest};
            return smallestAndLargest;
        }
    }
}
