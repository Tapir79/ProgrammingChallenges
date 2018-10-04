package problem4;

public class Problem4FindSmallestAndLargest {

    public static void main(String[] args) {

        int[] list = {1, 4, 10, 6, 9, 3, 2, 9, 4};

        findSmallestAndLargest(list);
    }

    private static void findSmallestAndLargest(int[] list) {

        if (list.length == 0) {
            System.out.println("List is empty");
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

            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);
        }
    }
}

