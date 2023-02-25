package week4;

import java.util.Arrays;

/**
 * The ArrayExample program shows examples of manipulating arrays.
 *
 * @author Yue Wang
 * @version Jan 22, 2023
 */
public class ArrayExample {
    /**
     * Print a 1D int array
     * @param arr This is the 1D int array to print
     */
    public static void print(int[] arr) {
        // Use a for-each loop to print each int in the array
        for(int data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    /**
     * Print a 2D array of integers
     * @param arr This is the 2D int array to print
     */
    public static void print(int[][] arr) {
        /*
         Use a nested loop to print each int in the 2D array, where i represents the
         index of each row and j represents the index of each column in i-th row
         */
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a 1D int array of size 6
        int[] data1 = new int[6];
        print(data1);
        System.out.println();

        // Change the values stored in data1
        Arrays.fill(data1, 6);
        data1[0] = 5;
        data1[4] = 7;
        data1[1] = 9;
        print(data1);
        System.out.println();

        // Sort data1
        Arrays.sort(data1);
        print(data1);
        System.out.println();

        // Create another array with the size doubled and copy the items
        int[] data2 = new int[data1.length * 2];
        for(int i = 0; i < data1.length; i++) {
            data2[i] = data1[i];
        }
        print(data2);
        System.out.println();

        // Reverse the array
        for(int i = 0; i < data2.length / 2; i++) {
            int temp = data2[i];
            data2[i] = data2[data2.length - i - 1];
            data2[data2.length - i - 1] = temp;
        }
        print(data2);
        System.out.println();

        // Create a 4 by 6 2D array
        int rows = 4;
        int columns = 6;
        int[][] numberGrid = new int[rows][columns];
        numberGrid[0][0] = 4;
        numberGrid[0][5] = 8;
        numberGrid[1][3] = 7;
        numberGrid[2][2] = 9;
        numberGrid[3][5] = 6;
        print(numberGrid);
        System.out.println();

        // Modify the second row of the 2D array
        int[] new_row = {1, 2 ,3, 4};
        numberGrid[1] = new_row;
        print(numberGrid);

    }
}
