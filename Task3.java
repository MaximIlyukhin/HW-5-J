/*Реализовать алгоритм пирамидальной сортировки (HeapSort). */

public class Task3 {
    public static void main(String[] args) {
        int[] array = { 10, 14, 2, 4, 6, 8, 12, 9, 7 };
        heapSort(array);
        System.out.println(array);
        System.out.println("After heapsort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ ", ");
        }
    }

    private static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, i, n);
        }
        for (int i =n-1;  i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] array, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < n && array[left] > array[largest])
            largest = left;
        if (right < n && array[right] > array[largest])
            largest = right;
        if (i != largest) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, largest, n);
        }
    }
}
