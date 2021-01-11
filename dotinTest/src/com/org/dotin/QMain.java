package com.org.dotin;

import java.util.Scanner;

public class QMain {

    public static void main(String[] args) {

        sumMat(getMat(3, 3));
    }

    public static int[][] getMat(int row, int column) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println(scanner.nextInt());
//    }
        int j;
        int i;
        int[][] m = new int[row][column];
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < row && i < column; i++) {
            for (j = 0; j < column; j++) {
                m[i][j] = scanner.nextInt();
            }

        }
        scanner.close();
        System.out.println(m[1][1]);
        return m;
    }


    public static void sumMat(int[][] m) {
        int i = 0;

//        for (i = 0; m.length > i; i++) {
//            System.out.println("for aval");
        int sumRow = 0;
        int sumColumn = 0;
        for (int k = 0; k < m.length; k++) {

//soton aval
            for (int j = 0; m.length > j; j++) {
                System.out.println("for aval");

//                int sumRow = 0;
//                int sumColumn = 0;
                if (k > 0) {
                    sumRow += m[k][j];
                    sumColumn +=m[j][k - k];
                    System.out.println("m[k][j](col1)=" + m[k][j] + "\n m[h][k](col1)=" + m[j][k - k]);
                    System.out.println("sum row(col1)=" + sumRow + "\n sum column is(col1):" + sumColumn);

                } else {
                    sumRow += m[k][j];
                    sumColumn += m[j][k];
                    System.out.println("m[k][j] col1=" + m[k][j] + "\n m[h][k] col1=" + m[j][k]);
                    System.out.println("sum row col1=" + sumRow + "\n sum column is(col1):" + sumColumn);

                }
            }
            //soton dovom
            for (int j = 0; m.length > j; j++) {
                System.out.println("for dovom");
//                int sumRow = 0;
//                int sumColumn = 0;
                if (k >= 2) {
                    sumRow += m[k][j];
                    System.out.println("jjjj");
                    sumColumn += m[j][k - 1];
                    System.out.println("m[k][j](col2)=" + m[k][j] + "\n m[h][k](col2)=" + m[j][k - 1]);
                    System.out.println("sum row(col2)=" + sumRow + "\n sum column is(col2):" + sumColumn);

                } else if (k == 1) {
                    sumRow += m[k][j];
                    sumColumn += m[j][k];
                    System.out.println("m[k][j](col2)=" + m[k][j] + "\n m[h][k](col2)=" + m[j][k]);
                    System.out.println("sum row(col2)=" + sumRow + "\n sum column is(col2):" + sumColumn);

                } else {
                    sumRow += m[k][j];
                    sumColumn += m[j][k + 1];
                    System.out.println("m[k][j](col2)=" + m[k][j] + "\n m[h][k](col2)=" + m[j][k - k + 1]);
                    System.out.println("sum row(col2)=" + sumRow + "\n sum column is(col2):" + sumColumn);

                }
            }
//soton sevom
            for (int j = 0; j < m.length; j++) {

                if (k == 0) {
                    sumRow += m[k][j];
                    System.out.println("jjjj");
                    sumColumn += m[j][k + 2];
                    System.out.println("m[k][j](col2)=" + m[k][j] + "\n m[h][k](col2)=" + m[j][k + 2]);
                    System.out.println("sum row(col2)=" + sumRow + "\n sum column is(col2):" + sumColumn);

                } else if (k == 1) {
                    sumRow += m[k][j];
                    sumColumn += m[j][k + k];
                    System.out.println("m[k][j](col2)=" + m[k][j] + "\n m[h][k](col2)=" + m[j][k + k]);
                    System.out.println("sum row(col2)=" + sumRow + "\n sum column is(col2):" + sumColumn);

                } else {
                    sumRow += m[k][j];
                    sumColumn += m[j][k];
                    System.out.println("m[k][j](col2)=" + m[k][j] + "\n m[h][k](col2)=" + m[j][k]);
                    System.out.println("sum row(col2)=" + sumRow + "\n sum column is(col2):" + sumColumn);

                }
            }

        }
    }

}
