package sort.sorters;

import sort.SortStatistic;
import java.util.ArrayList;

//Сортировка пузурьком
public class BubbleSort implements ISort {

    public ArrayList sort(ArrayList<Integer> array, SortStatistic sortStatistic) {
        if (array.size() > 1) {
            for (int i = 0; i < array.size(); i++) {
                Integer min = array.get(i);
                int minPos = i;
                for (int j = i + 1; j < array.size(); j++) {
                    Integer cur = array.get(j);
                    if (min > cur) {
                        min = cur;
                        minPos = j;
                    }
                    if (sortStatistic != null) {
                        sortStatistic.makeStep();
                    }
                }
                Integer buf = array.get(i);
                array.set(i, min);
                array.set(minPos, buf);
            }
        }
        return array;
    }

}
