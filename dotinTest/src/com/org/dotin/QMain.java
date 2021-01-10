package com.org.dotin;

import java.util.Scanner;

public class QMain {


        public static void main(String[] args) {

            sumMat(getMat(3, 3));
        }

        public static int[][] getMat(int row, int column) {

            int j;
            int i;
            int[][] m = new int[row][column];
            Scanner scanner = new Scanner(System.in);
            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    m[i][j] = scanner.nextInt();
                }

            }
            scanner.close();
            System.out.println(m[1][1]);
            return m;
        }


        public static void sumMat(int[][] m) {
            int i = 0, j = 0;

            for (i = 0; m.length > i; i++) {
                System.out.println("for aval");
                for (int k = i; k < m.length; k++) {

                    int sumRow = 0;
                    int sumColumn = 0;

                    for (j = 0; m.length > j; j++) {
                        for (int h = j; h < m.length; h++) {
                            System.out.println("for dovom");
                            sumRow += m[k][h];
                            sumColumn += m[h][k];
                            System.out.println("m[j][k]" + m[h][k] + "\n m[j][k]=" + m[h][k]);
                        }
                        System.out.println("sum row=" + sumRow + "\n sum column is:" + sumColumn);
//                }
                    }
                }
            }
        }
    }


