package sort.sorters;

import sort.SortStatistic;

import java.util.ArrayList;
import java.util.Collections;

//Эталонный сортировщик из библиотеки Java
public class EtalonSort implements ISort {

    public ArrayList sort(ArrayList<Integer> array, SortStatistic sortStatistic) {
        Collections.sort(array);
        sortStatistic.makeStep();
        if (sortStatistic != null) {
            sortStatistic.makeStep();
        }
        return array;
    }
}
