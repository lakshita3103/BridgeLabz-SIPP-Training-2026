import java.util.*;
public class InsertionSortAlgo {
    public static void insertionSort(int[] ids) {
        int n = ids.length;

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert the key at its correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter Employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        insertionSort(ids);

        System.out.println("Employee IDs in Ascending Order:");
        for (int id : ids) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}
