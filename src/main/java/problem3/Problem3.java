package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Problem3 {

    /**
     * Remove repeating and duplicate values from a list without using any Collection API
     * @param list
     * @return
     */
    public ArrayList<Integer> removeRepeatingValuesWithoutCollectionAPI(ArrayList<Integer> list) {
        
        ArrayList<Integer> checked = new ArrayList<Integer>();
        Collections.sort(list);
        // the first index
        Integer previous = list.get(0);

        // Add the first
        checked.add(previous);

        for (Integer i : list) {
            if (previous != i) {
                checked.add(i);
            }
           
            previous = i;
        }

     return checked;

    }

    /**
     * Find a set of values that repeat 1 or more time in a list of integers
     * @param list
     * @return
     */
    public Set<Integer> findRepeatingValuesWithoutCollectionAPI(ArrayList<Integer> list){

        Set<Integer> repeatingValues = new HashSet<Integer>();
        Collections.sort(list);
        // the first index
        Integer previous = list.get(0);

        for (Integer i : list) {
            if (previous == i) {
                repeatingValues.add(i);
            }
            previous = i;
        }

        return repeatingValues;
    }


    /**
     * Remove repeating and duplicate values from a list using hashSet
     * @param list
     * @return
     */
    public Set<Integer> useHashSet(ArrayList<Integer> list) {

       // Collections.sort(list);
        Set<Integer> set = new HashSet<Integer>();

        // Just create a hashset from the list
        set.addAll(list);

        return set;
    }

}
