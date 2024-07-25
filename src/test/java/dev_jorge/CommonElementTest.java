package dev_jorge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;



public class CommonElementTest {

    @Test
    public void testFindCommonElements() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 5));
        ArrayList<Integer> result = commonElement.findCommonElements(list1, list2);

        assertEquals(expected, result);
    }

    @Test
    public void testNoCommonElements() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> result = commonElement.findCommonElements(list1, list2);

        assertEquals(expected, result);
    }

}