package com.org.dotin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        findBestStock(getDayes());
    }

    private static ArrayList<Integer> getDayes() {
        ArrayList stocskArray = new ArrayList<Integer>();
        Scanner stocks = new Scanner(System.in);
        System.out.println("tedade rozhahye morede tahlil ra vared konid");
        int length = stocks.nextInt();
        System.out.println("arzehe saham ra dar har roz vared konid");
        for (int i = 0; length > i; i++) {
            stocskArray.add(stocks.nextInt());
        }
        return stocskArray;
    }

    private static void findBestStock(ArrayList<Integer> days) {
        int lastMI = days.get(0);
        List<Integer> downProfits = new ArrayList();
        List<Integer> topTrans = new ArrayList();
        int lengthDays = days.size();
        for (int i = 0; i < lengthDays; i++) {
            if (!days.get(i).equals(days.get(0)) && days.get(i) > days.get(i - 1) && (days.indexOf(days.get(i)) == days.size() - 1 || days.get(i) > days.get(i + 1))) {
                int profit = lastMI;
                for (int j = days.indexOf(lastMI); !days.get(j).equals(days.get(i)); j++) {
                    if (days.get(j) < days.get(j + 1) && days.get(j) < profit) {
                        profit = days.get(j);
                    }
                }
                lastMI = days.get(i);
                downProfits.add(profit);
                Collections.sort(downProfits);
                topTrans.add(days.get(i) - downProfits.get(0));
            }
        }
        if (topTrans.size() > 0) {
            Collections.sort(topTrans);
            System.out.println("bishtarin sode momken =" + topTrans.get(topTrans.size() - 1));
        } else System.out.println("daryafte sod gheyre momken ast");
    }
}
