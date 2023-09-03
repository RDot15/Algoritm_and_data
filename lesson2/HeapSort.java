package lesson2;

public class HeapSort {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 3, 2, 8, 6, 4, 9, 7,0};
        heapSort(arr);
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, i, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }

    }
    private static void heapify(int[] arr, int i, int n) {
        int childLeft = i*2 + 1;
        int childRight = i*2 + 2;
        int largest = i;

        if (childLeft < n && arr[childLeft] > arr[largest]) {
            largest = childLeft;
        }
        if (childRight < n && arr[childRight] > arr[largest]) {
            largest = childRight;
        }

        if (largest!=i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }

    }

}

