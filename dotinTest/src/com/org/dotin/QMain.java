package com.org.dotin;

import java.util.Scanner;

public class QMain {

    public static void main(String[] args) {

        findMinimum(getMatrix(3, 3));

    }

    private static int findMinimumFromMS(int[][] arr, int[][] ms) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] != ms[i][j])
                    sum++;
            }
        }
        return sum;
    }

    private static void findMinimum(int[][] arr) {
        int[][][] ms = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };

        int min = 9;
        for (int i = 0; i < 8; i++) {
            int x = findMinimumFromMS(arr, ms[i]);
            if (x < min)
                min = x;
        }
        System.out.println("minmum to change is:" + min);
    }

    private static int[][] getMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        System.out.println("Matrix khod ra vared konid");
        Scanner scanMatrix = new Scanner(System.in);
        for (int i = 0; i < row && i < column; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanMatrix.nextInt();
            }
        }
        return matrix;
    }


}





