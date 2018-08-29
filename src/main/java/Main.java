import helpers.CollectionHelpers;
import sort.SortRunner;
import sort.sorters.BubbleSort;
import sort.sorters.EtalonSort;
import sort.sorters.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = CollectionHelpers.getSampleArray(10000, 1000);
        CollectionHelpers.printCollection("input",arr);

        int runCount = 100;
        SortRunner sortRunner;
        new SortRunner(new EtalonSort(), runCount, arr).sort();
        new SortRunner(new BubbleSort(), runCount, arr).sort();
        new SortRunner(new QuickSort(), runCount, arr).sort();



        /*
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5, 4, 5, 2 , 1));
        CollectionHelpers.printCollection("",arr);

        int runCount = 10;
        new SortRunner(new QuickSort(), 1, arr).sort();
        */

    }
}
