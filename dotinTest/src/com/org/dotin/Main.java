package com.org.dotin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        selectionSort(getArray(scanner.nextInt()));
    }

    public static void selectionSort(List<Integer> arr) {
        int i, j, minIndex, tmp, sum = 0;
        int n = arr.size();
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
            if (arr.get(j) < arr.get(minIndex))
                minIndex = j;
            if (minIndex != i) {
                tmp =  arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, tmp);
                sum++;
            }
        }
        System.out.println("sum of idnex shifts was:"+sum);
        System.out.println("and its sort is:"+arr);
    }
    public static ArrayList<Integer> getArray(int length) {
        ArrayList list = new ArrayList<Integer>(length);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; length > i; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(list);
        return list;
    }

}
