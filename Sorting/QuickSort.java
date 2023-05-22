package Sorting;

public class QuickSort {
        public  int[] quickSort(int[] array) {
            quickSort(array, 0, array.length - 1);
            return array;
        }

        public void quickSort(int[] array, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(array, low, high);
                quickSort(array, low, pivotIndex - 1);
                quickSort(array, pivotIndex + 1, high);
            }
        }

        private int partition(int[] array, int low, int high) {
            int pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {
                    i++;
                    swap(array, i, j);
                }
            }
            swap(array, i + 1, high);
            return i + 1;
        }

        private void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        QuickSort quickSort = new QuickSort();
        int[] sortedArray = quickSort.quickSort(array);
        for(int num: array){
            System.out.print(num+", ");
        }

    }
}
