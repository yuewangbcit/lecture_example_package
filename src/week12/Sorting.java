package src.week12;

/**
 * Demonstrates the selection sort and insertion sort algorithms.
 *
 * @author BCIT
 * @version 2020
 */
public final class Sorting {

    private Sorting() {
    }

    /**
     * Sorts the specified collection of objects using the selection sort algorithm.
     *
     * @param <T>  Type placeholder for comparable type
     * @param list Array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSort(final T[] list) {
        int min;
        T temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    /**
     * Sorts the specified collection of objects using the insertion sort algorithm.
     *
     * @param <T>  Type placeholder for comparable type
     * @param list Array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(final T[] list) {
        for (int index = 1; index < list.length; index++) {
            T key = list[index];
            int position = index;

            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position - 1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }

    /**
     * Merge two sorted sub-arrays.
     *
     * @param <T>  Type placeholder for comparable type
     * @param arr Array to be sorted
     * @param low The lowest index of the sub-array to merge
     * @param middle The middle index of the sub-array to merge
     * @param high The highest index of the sub-array to merge
     */
    public static <T extends Comparable<T>> void merge(T arr[], int low, int middle, int high) {
        // Find sizes of two sub-arrays to be merged
        int n1 = middle - low + 1;
        int n2 = high - middle;

        /* Create temp arrays */
        Object L[] = new Object[n1];
        Object R[] = new Object[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[middle + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = low;
        while (i < n1 && j < n2) {
            if (((T)L[i]).compareTo((T)R[j]) <= 0) {
                arr[k] = (T) L[i];
                i++;
            }
            else {
                arr[k] = (T) R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = (T) L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = (T) R[j];
            j++;
            k++;
        }
    }

    /**
     * Sorts the specified collection of objects using the merge sort algorithm.
     *
     * @param <T>  Type placeholder for comparable type
     * @param arr Array to be sorted
     * @param low The lowest index of the sub-array to sort
     * @param high The highest index of the sub-array to sort
     */
    public static <T extends Comparable<T>> void mergeSort(T arr[], int low, int high) {
        if (low < high) {
            // Find the middle point
            int middle = low + (high - low) / 2;

            // Sort first and second halves
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);

            // Merge the sorted halves
            merge(arr, low, middle, high);
        }
    }


    /**
     * Swap the elements at index i and j of an array.
     *
     * @param <T>  Type placeholder for comparable type
     * @param arr Array to be sorted
     * @param i The index of one element to swap
     * @param j The index of another element to swap
     */
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Partition a subset of array (from index low to index high) into two parts.
     *
     * @param <T>  Type placeholder for comparable type
     * @param arr Array to be sorted
     * @param low The lowest index of the sub-array to partition
     * @param high The highest index of the sub-array to partition
     */
    public static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        // pivot
        T pivot = arr[high];

        // Index of smaller element indicates the right position of pivot
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j].compareTo(pivot) < 0) {
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /**
     * Sorts the specified collection of objects using the quick sort algorithm.
     *
     * @param <T> Type placeholder for comparable type
     * @param arr Array to be sorted
     * @param low The lowest index of the subset of the array to sort
     * @param high The highest index of the subset of the array to sort
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[p] is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}

