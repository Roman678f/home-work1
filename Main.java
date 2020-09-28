package homework.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        SomeComparator comparator = new SomeComparator();
        DataContainer<Integer> container = new DataContainer(new Integer[7]);   //BoxGeneric<String> box1 = new BoxGeneric<>();   (T[] data)
        container.add(9);
        container.add(3);
        container.add(1);
        container.add(8);
        container.add(6);
        System.out.println("toString-- "+container.toString());

        System.out.println("get-- "+container.get(2));

        container.delete(0);
        System.out.println("delete(index)-- "+container.toString());

        container.deleteItem(3);
        System.out.println("deleteItem-- "+container.toString());

        container.sort(comparator);
        System.out.println("sort-- "+container.toString());
    }
}
