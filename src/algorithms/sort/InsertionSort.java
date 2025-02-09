package algorithms.sort;

/**
 * Алгоритмы сортировки. Сортировка вставками
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > elem) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }

            arr[j] = elem;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 6, 4};
        sort(nums);
    }
}
