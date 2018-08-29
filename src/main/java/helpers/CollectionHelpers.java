package helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class CollectionHelpers {
    public static void printCollection(String name, List<Integer> arr) {
        if (! name.isEmpty()) {
            System.out.print(name + ":");
        }
        for (int i=0; i<100; i++) {
            System.out.print(arr.get(i)+", ");
        }
        System.out.println("");
    }

    public static ArrayList<Integer> getSampleArray(int size, int max){
        Random rn = new Random();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for (int i=0; i<size; i++) {
            arr.add(ThreadLocalRandom.current().nextInt(1, 1000 + 1));
        }
        return arr;
    }

    public static ArrayList<Integer> getSampleArray(){
        Random rn = new Random();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0; i<10000; i++) {
            arr.add(ThreadLocalRandom.current().nextInt(1, 1000 + 1));
        }
        return arr;
    }

    public static ArrayList<Integer> cloneArray(ArrayList<Integer> list) {
        ArrayList<Integer> clone = new ArrayList<Integer>(list.size());
        for (Integer item : list) {
            clone.add(item.intValue() );
        }
        return clone;
    }
}
