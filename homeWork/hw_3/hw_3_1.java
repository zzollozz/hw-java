package homeWork.hw_3;

import java.util.Arrays;

public class hw_3_1 {
    public static void main(String[] args) {
        // (Дополнительное) Реализовать алгоритм сортировки слиянием

        int[] arr = {3, 8, 1, 9, 10, 2, 5, 7, 4, 6};
        
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
    
        sort(arr, 0, arr.length - 1);
    
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
        int middle = (left + right) / 2;
        sort(arr, left, middle);
        sort(arr, middle + 1, right);
        merge(arr, left, middle, right);
        }
    }
    
    private static void merge(int[] arr, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;
    
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
    
        for (int i = 0; i < leftSize; ++i) {
        leftArr[i] = arr[left + i];
        }
    
        for (int j = 0; j < rightSize; ++j) {
        rightArr[j] = arr[middle + 1 + j];
        }
    
        int i = 0;
        int j = 0;
        int k = left;
    
        while (i < leftSize && j < rightSize) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k] = leftArr[i];
            i++;
        } else {
            arr[k] = rightArr[j];
            j++;
        }
        k++;
        }
    
        while (i < leftSize) {
        arr[k] = leftArr[i];
        i++;
        k++;
        }
    
        while (j < rightSize) {
        arr[k] = rightArr[j];
        j++;
        k++;
        }
    }
}
