package dz2;

public class andreius {
    /* 
    Best case: O(n)
    Average case: O(n^2)
    Bad case: O(n^2)
    Stable: yes
    */

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean less(int[] array, int i, int j) {
        return array[i] < array[j];
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 1; j < array.length; j++) {
                if (less(array, j, j - 1)) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 0, -1, 4, -3};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
