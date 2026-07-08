package DSA.ScenerioBasedProblems;

import java.util.Arrays;

public class SportMeet {

    public static void bubbleSort(int[] arr) {
        int swaps = 0;
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("Total Swaps = " + swaps);
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11, 45, 23, 44, 56, 56};

        int[] bubble = arr.clone();
        int[] insertion = arr.clone();

        System.out.println("Bubble Sort");
        bubbleSort(bubble);

        System.out.println("\nInsertion Sort");
        insertionSort(insertion);

        System.out.println("\nTop 3 Medalists:");
        System.out.println("Gold   : " + insertion[insertion.length - 1]);
        System.out.println("Silver : " + insertion[insertion.length - 2]);
        System.out.println("Bronze : " + insertion[insertion.length - 3]);
    }
}