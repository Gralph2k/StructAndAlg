package sort;

import helpers.CollectionHelpers;
import sort.sorters.ISort;

import java.util.ArrayList;

public class SortRunner {
    private int runCount;
    private ISort sorter;
    private SortStatistic sortStatistic;
    private ArrayList<Integer> array;
    private ArrayList<Integer> sortedArray= new ArrayList<Integer>();;

    public SortRunner(ISort sorter, int runCount, ArrayList<Integer> array) {
        this.sorter = sorter;
        this.runCount = runCount;
        this.array = CollectionHelpers.cloneArray(array);
        sortStatistic = new SortStatistic();
    }

    public int getRunCount() {
        return runCount;
    }

    public void setRunCount(int runCount) {
        this.runCount = runCount;
    }

    public ISort getSorter() {
        return sorter;
    }

    public void setSorter(ISort sorter) {
        this.sorter = sorter;
    }

    public ArrayList<Integer> sort() {
        sortStatistic.run();
        for (int i = 0; i < runCount; i++) {
            sortedArray = sorter.sort(array, sortStatistic);
        }
        sortStatistic.stop();
        return sortedArray;
    }

    public ArrayList<Integer> sortWithStatistic() {
        ArrayList<Integer> result = sort();
        printStatistic();
        return result;
    }

    public void printStatistic() {
        System.out.println(String.format("----\nName: %s\nSteps: %d\nDuration: %d\nStart : %s\nFinish: %s \n",
                sorter.getClass().getName()
                , sortStatistic.getSteps()
                , sortStatistic.getDurationNano() / 1000000
                , sortStatistic.getStart()
                , sortStatistic.getFinish()
        ));
        CollectionHelpers.printCollection("", sortedArray);
        System.out.println("\n---");
    }

}
