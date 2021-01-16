package com.org.dotin;

import java.util.Scanner;

public class QMain {

    public static void main(String[] args) {

        findLeastDifference(getMatrix(3, 3));
    }

    public static int[][] getMatrix(int row, int column) {
        int[][] m = new int[row][column];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row && i < column; i++) {
            for (int j = 0; j < column; j++) {
                m[i][j] = scanner.nextInt();
            }

        }
        scanner.close();
        return m;
    }

 //   a1 to a8 namayande 8 halate momken ast,dar akhar bozorgtarin az 9 kam mishavad
    public static void findLeastDifference(int[][] matrix) {
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0;
        //int notEqualAny = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[0][0]) {
                    switch (matrix[0][0]) {
                        case 9:
                            a1++;
                            a2++;

                            break;
                        case 4:
                            a3++;
                            a8++;

                            break;
                        case 2:
                            a4++;
                            a7++;

                            break;
                        case 8:
                            a5++;

                            break;
                        case 6:
                            a6++;

                            break;
                        default:
                            // notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[0][1]) {
                    switch (matrix[0][1]) {
                        case 2:
                            a1++;
                            a3++;

                            break;
                        case 4:
                            a2++;
                            a4++;

                            break;
                        case 1:
                            a5++;
                            a6++;

                            break;
                        case 9:
                            a7++;
                            a8++;

                            break;
                        default:
                            //notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[0][2]) {
                    switch (matrix[0][2]) {
                        case 4:
                            a1++;
                            a7++;

                            break;
                        case 2:
                            a2++;
                            a8++;

                            break;
                        case 9:
                            a3++;
                            a4++;

                            break;
                        case 6:
                            a5++;

                            break;
                        case 8:
                            a8++;

                            break;
                        default:
                            //notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[1][0]) {
                    switch (matrix[1][0]) {
                        case 1:
                            a1++;
                            a2++;

                            break;
                        case 8:
                            a3++;

                            break;
                        case 6:
                            a4++;

                            break;
                        case 3:
                            a5++;
                            a8++;

                            break;
                        case 7:
                            a6++;
                            a7++;

                            break;
                        default:
                            //  notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[1][1]) {
                    switch (matrix[1][1]) {
                        case 6:
                            a1++;
                            a3++;

                            break;
                        case 8:
                            a2++;
                            a4++;

                            break;
                        case 5:
                            a5++;
                            a6++;
                            a7++;
                            a8++;

//                            System.out.println(matrix[i][j]);
                            break;
                        default:
                            //   notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[1][2]) {
                    switch (matrix[1][2]) {
                        case 8:
                            a1++;

                            break;
                        case 6:
                            a2++;

                            break;
                        case 1:
                            a3++;
                            a4++;

                            break;
                        case 7:
                            a5++;
                            a8++;

                            break;
                        case 3:
                            a6++;
                            a7++;

                            break;
                        default:
                            //     notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[2][0]) {
                    switch (matrix[2][0]) {
                        case 5:
                            a1++;
                            a2++;

                            break;
                        case 3:
                            a3++;

                            break;
                        case 7:
                            a4++;

                            break;
                        case 4:
                            a5++;

                            break;
                        case 2:
                            a6++;

                            break;
                        case 6:
                            a7++;

                            break;
                        case 8:
                            a8++;

                            break;
                        default:
                            //       notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[2][1]) {
                    switch (matrix[2][1]) {
                        case 7:
                            a1++;
                            a3++;

                            break;
                        case 3:
                            a2++;
                            a4++;

                            break;
                        case 9:
                            a5++;
                            a6++;

                            break;
                        case 1:
                            a7++;
                            a8++;

                            break;
                        default:
                            //         notEqualAny++;
                    }
                } else if (matrix[i][j] == matrix[2][2]) {
                    switch (matrix[2][2]) {
                        case 3:
                            a1++;

                            break;
                        case 7:
                            a2++;

                            break;
                        case 5:
                            a3++;
                            a4++;

                            break;
                        case 2:
                            a5++;

                            break;
                        case 4:
                            a6++;

                            break;
                        case 8:
                            a7++;

                            break;
                        case 6:
                            a8++;

                            break;
                        default:
                            //           notEqualAny++;
                    }
                } else
                    System.out.println("omran");
            }
        }
        System.out.println();
        if (a1 >= a2 && a1 >= a3 && a1 >= a4 && a1 >= a5 && a1 >= a6 && a1 >= a7 && a1 >= a8) {
            System.out.println("meghdare" + a1 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a1));
        } else if (a2 >= a1 && a2 >= a3 && a2 >= a4 && a2 >= a5 && a2 >= a6 && a2 >= a7 && a2 >= a8) {
            //System.out.println("meghdare" + a2 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a2));
        } else if (a3 >= a1 && a3 >= a2 && a3 >= a4 && a5 >= a3 && a3 >= a6 && a3 >= a7 && a3 >= a8) {
            //System.out.println("meghdare" + a3 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a3));
        } else if (a4 >= a1 && a4 >= a2 && a4 >= a3 && a4 >= a5 && a4 >= a6 && a4 >= a7 && a4 >= a8) {
            //System.out.println("meghdare" + a4 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a4));
        } else if (a5 >= a1 && a5 >= a2 && a5 >= a4 && a3 <= a5 && a5 >= a6 && a5 >= a7 && a5 >= a8) {
            //System.out.println("meghdare" + a5 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a5));
        } else if (a6 >= a1 && a6 >= a2 && a6 >= a4 && a3 <= a6 && a6 >= a5 && a6 >= a7 && a6 >= a8) {
            //System.out.println("meghdare" + a6 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a6));
        } else if (a7 >= a1 && a7 >= a2 && a7 >= a4 && a3 <= a7 && a7 >= a6 && a7 >= a5 && a7 >= a8) {
            // System.out.println("meghdare" + a7 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a7));
        } else if (a8 >= a1 && a8 >= a2 && a8 >= a4 && a3 <= a8 && a8 >= a6 && a8 >= a7 && a8 >= a5) {
//            System.out.println("meghdare" + a8 + " sahih ast");
            System.out.println("minimom for change is: " + (9 - a8));
        }


    }
}





