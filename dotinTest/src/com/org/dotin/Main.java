package com.org.dotin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        selectionSort(getArray());
    }

    private static void selectionSort(List<Integer> arr) {
        List<Integer> firestPosition = new ArrayList<>();
        firestPosition.addAll(arr);
        int j, minIndex, tmp, sum = 0;
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr.get(j) < arr.get(minIndex))
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, tmp);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (!firestPosition.get(i).equals(arr.get(i)))
                sum++;
        }

        //7 8 3 6 2 9 /7 8 3 9 2 6
        System.out.println(sum + "index changed");
        System.out.println("and its sort is:" + arr);
    }

    private static ArrayList<Integer> getArray() {
        ArrayList arrayList = new ArrayList<Integer>();
        Scanner getArrayState = new Scanner(System.in);
        System.out.println("tole araye ra vared konid");
        int ArraySize = getArrayState.nextInt();
        System.out.println("meghdare har khane araye ra vared konid");
        for (int i = 0; ArraySize > i; i++) {
            arrayList.add(getArrayState.nextInt());
        }
        return arrayList;
    }

}
