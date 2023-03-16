package dz3;

public class task1 {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void mergesort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && array[j] > key) {
                swap(array, j, j + 1);
                j-=1;
            } 
        }
    }

    public static void main(String[] args) {
        int[] mas = new int[] {43, 76, 12, 14, 6, 1234, 5, 0};
        mergesort(mas);        
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }
}