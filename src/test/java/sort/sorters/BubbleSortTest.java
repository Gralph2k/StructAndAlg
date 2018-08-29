package sort.sorters;

import helpers.CollectionHelpers;
import sort.SortRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @org.junit.Test
    public void sort() {
        ArrayList<Integer> notSorted = CollectionHelpers.getSampleArray(100,100);
        int runCount=1;

        ArrayList<Integer> expected = new SortRunner(new EtalonSort(), runCount, notSorted).sort();
        ArrayList<Integer> sorted =  new SortRunner(new BubbleSort(), runCount, notSorted).sort();

        assertTrue(isEqualArrayList(expected, sorted));
        assertFalse(isEqualArrayList(notSorted, sorted));
    }


    private boolean isEqualArrayList(ArrayList a, ArrayList b){
        if (a.size()!=b.size()) {
            return false;
        }
        for (int i=0;i<a.size();i++){
            if (!a.get(i).equals(b.get(i))) {
               return false;
            }
        }
        return true;
    }
}