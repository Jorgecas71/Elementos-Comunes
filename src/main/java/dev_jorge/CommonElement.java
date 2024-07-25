package dev_jorge;

import java.util.ArrayList;

public class CommonElement {

    private ArrayList<Integer> commonElements = new ArrayList<>();

    public ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (Integer element : list1) {
            if (list2.contains(element) && !commonElements.contains(element)) {
                commonElements.add(element);
            }
        }
        return commonElements;
    }

}