package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Problem3RemoveDuplicatesInArray {

    public static void main(String[] args) {

        //sort array

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        useHashSet(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        findAndRemoveManyDuplicatesWithoutCollectionAPI(list2);

    }

    private static void findAndRemoveManyDuplicatesWithoutCollectionAPI(ArrayList<Integer> list) {

        Set<Integer> duplicates = new HashSet<Integer>();
        ArrayList<Integer> checked = new ArrayList<Integer>();
        Collections.sort(list);
        // the first index
        Integer previous = list.get(0);

        // Add the first
        checked.add(previous);

        for (Integer i : list) {
            if (previous != i) {
                System.out.println("Add to checked: " + i);
                checked.add(i);
            }
            // previous Integer equals the next Integer, so it appears 2 or more times in the Array
            if (previous == i) {
                System.out.println("Add to duplicates: " + i);
                duplicates.add(i);
            }
            previous = i;
        }

        // print original values
        System.out.print("\nOriginal: ");
        for (Integer i : list
                ) {
            System.out.print(i + " ");
        }

        System.out.print("\nCleaned array: ");
        for (Integer i : checked
                ) {
            System.out.print(i + " ");
        }

        System.out.print("\nValues that exist 2 or more times: ");
        for (Integer i : duplicates
                ) {
            System.out.print(i + " ");
        }

    }


    private static void useHashSet(ArrayList<Integer> list) {

        Collections.sort(list);
        Set<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> found = new ArrayList<>();

        // Create a hashset from the list

        set.addAll(list);
        System.out.print("Original list: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.print("\nHashSet: ");
        for (Integer i : set) {
            System.out.print(i + " ");
        }

    }

}
