package dev_jorge;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter the number of elements for the first list:");
        int n1 = scanner.nextInt();
        System.out.println("Enter the elements for the first list:");
        for (int i = 0; i < n1; i++) {
            list1.add(scanner.nextInt());
        }

        System.out.println("Enter the number of elements for the second list:");
        int n2 = scanner.nextInt();
        System.out.println("Enter the elements for the second list:");
        for (int i = 0; i < n2; i++) {
            list2.add(scanner.nextInt());
        }

        CommonElement commonElement = new CommonElement();
        ArrayList<Integer> commonElements = commonElement.findCommonElements(list1, list2);

        System.out.println("Common elements:");
        for (Integer element : commonElements) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}