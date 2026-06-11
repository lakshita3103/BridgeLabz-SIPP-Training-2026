/*A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid. */

//import java.util.Scanner;

public class WarehouseStore {

    // maximum stock
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // minimum stock
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // total stock
    public static int findTotal(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // duplicates
    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate quantities: ");
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.print("No duplicates");
        }
        System.out.println();
    }

    // Rotate array by k positions to the right
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.out.print("Rotated Array: ");
        for (int num : temp) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Transpose 2D matrix
    public static void transposeMatrix(int[][] matrix) {
        System.out.println("Transpose of Shelf Grid:");

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] stock = {10, 25, 15, 25, 40, 10};

        System.out.println("Maximum Stock = " + findMax(stock));
        System.out.println("Minimum Stock = " + findMin(stock));
        System.out.println("Total Stock = " + findTotal(stock));

        findDuplicates(stock);

        int k = 2;
        rotateArray(stock, k);

        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transposeMatrix(shelf);
    }
}