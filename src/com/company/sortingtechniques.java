package com.company;
/**
 * Created by karmagamer on 5/10/16.
 */
import java.util.Scanner;

public class sortingtechniques {
    static int N;
    static int[] array;
    static int[] temp;

    public sortingtechniques() {

    }

    public static void main(String[] args) {
        boolean again = true;
        do {
            int x, y;
            Scanner kbReader = new Scanner(System.in);
            System.out.println("Enter the number of integer elements");
            x = kbReader.nextInt();
            array = new int[x];
            System.out.println("Enter " + x + " integer elements");
            for (int i = 0; i < array.length; i++)
                array[i] = kbReader.nextInt();
            System.out.println("Enter:\n 1 for radix sort \n 2 for heap sort \n 3 for merge sort \n 4 for quick sort");
            y = kbReader.nextInt();
            String sort = "";
            switch (y) {
                case 1:
                    sort = "radix";
                    radixSort(array);
                    break;
                case 2:
                    sort = "heap";
                    heapSort(array);
                    break;
                case 3:
                    sort = "merge";
                    mergeSort(array);
                case 4:
                    sort = "quick";
                    quickSort(array, 0, array.length - 1);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println("Elements after " + sort + " sorting ");
            for (int i : array)
                System.out.print(i + " ");
            System.out.println("\nType n to stop...anything else keeps going");
            String str = kbReader.next();
            if (str.equals("n"))
                again = false;
            else
                continue;
            kbReader.close();

        } while (again);

    }

    private static void radixSort(int[] array) {
        int i, m = array[0], exp = 1, n = array.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (array[i] > m)
                m = array[i];
        while (m / exp > 0) {
            int[] bucket = new int[10];

            for (i = 0; i < n; i++)
                bucket[(array[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(array[i] / exp) % 10]] = array[i];
            for (i = 0; i < n; i++)
                array[i] = b[i];
            exp *= 10;
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array == null || array.length == 0)
            return;
        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

    }

    private static void mergeSort(int[] array) {

        temp = new int[array.length];
        doMergeSort(0, array.length - 1);
    }

    private static void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }

    }

    private static void heapSort(int[] array) {
        heapify(array);
        for (int i = N; i > 0; i--) {
            swap(array, 0, i);
            N = N - 1;
            maxheap(array, 0);
        }
    }

    /* Function to build a heap */
    public static void heapify(int arr[]) {
        N = arr.length - 1;
        for (int i = N / 2; i >= 0; i--)
            maxheap(arr, i);
    }

    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }

    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}