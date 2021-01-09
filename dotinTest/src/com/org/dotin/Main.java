package com.org.dotin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(14);
        arrayList.add(7);
        arrayList.add(22);
        arrayList.add(32);
        selectionSort(arrayList);
    }

    public static void selectionSort(List arr) {
        int i, j, minIndex, tmp, sum = 0;
        int n = arr.size();
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
            if ((int)arr.get(j) < (int)arr.get(minIndex))
                minIndex = j;
            if (minIndex != i) {
                tmp = (int) arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, tmp);
                sum++;
            }
        }
        System.out.println("sum of idnex shifts was:"+sum);
        System.out.println("and its sort is:"+arr);
    }

}
