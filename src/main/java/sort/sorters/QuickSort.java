package sort.sorters;

import sort.SortStatistic;
import java.util.ArrayList;


//Быстрая сортировка
public class QuickSort implements ISort {
    public ArrayList sort(ArrayList<Integer> array, SortStatistic sortStatistic) {
        if (array.size() < 2) {
            return array;
        } else {
            Integer baseElement = array.get(array.size() / 2);
            ArrayList<Integer> eq = new ArrayList<Integer>();
            ArrayList<Integer> less = new ArrayList<Integer>();
            ArrayList<Integer> more = new ArrayList<Integer>();
            for (Integer i : array) {
                if (i < baseElement) {
                    less.add(i);
                } else if (i > baseElement) {
                    more.add(i);
                } else {
                    eq.add(i);
                }
                if (sortStatistic != null) {
                    sortStatistic.makeStep();
                }
            }

            ArrayList<Integer> result = new ArrayList<Integer>();
            result.addAll(sort(less, sortStatistic));
            result.addAll(eq);
            result.addAll(sort(more, sortStatistic));
            return result;
        }
    }


}
