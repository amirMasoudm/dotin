package com.org.dotin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        findBestStock(getArray(scanner.nextInt()));
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

    public static void findBestStock(ArrayList<Integer> days) {
        int lastMI = days.get(0);
        ArrayList<Integer> upProfits = new ArrayList();
        List<Integer> downProfits = new ArrayList();
        for (int i = 0; i < days.size(); i++) {
//            boolean zeroIndex=days.get(i).equals(days.get(0));
//            boolean upLeft=days.get(i) > days.get(i - 1);
//            boolean upRightEndArr=days.indexOf(days.get(i)) == days.size() - 1 || days.get(i) > days.get(i + 1);
            if (days.get(i).equals(days.get(0)) == false && days.get(i) > days.get(i - 1) && (days.indexOf(days.get(i)) == days.size() - 1 || days.get(i) > days.get(i + 1))) {
                int profit = lastMI;
                upProfits.add(days.get(i));
                //int j = days.indexOf(lastMI)
                //boolean endSerch=days.get(j).equals(days.get(i))
                for (int j = days.indexOf(lastMI); days.get(j).equals(days.get(i)) == false; j++) {
                    if (days.get(j) < days.get(j + 1) && days.get(j) < profit) {
                        profit = days.get(j);
                    }
                }
                downProfits.add(profit);
                lastMI = days.get(i);
            }

        }

        List<Integer> tops = new ArrayList();
        //int i=upProfits.size()
        for (int i = 0; i < upProfits.size(); i++) {
            //int upProfit=upProfites.get(i)
            for (int j = 0; j <= i; j++) {
                //int downProfits=downProfits.get(j)
                tops.add(upProfits.get(i) - downProfits.get(j));
            }
        }
        Collections.sort(tops);
        System.out.println("bishtarin sode momken =" + tops.get(tops.size() - 1));

    }

}
