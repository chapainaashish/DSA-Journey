package Sorting;

public class InsertionSort {
    public void sortArray(int array[]){
        for (int j=1; j<array.length-1; j++){
            int key = array[j];
            int i = j-1;

            while(i>=0 && key<array[i]){
                array[i+1]=array[i];
                i--;
            }
            array[i+1]=key;

        }
    }

    public static void main(String[] args) {
        InsertionSort i1 = new InsertionSort();
        int array[] = {10, 4, 7, 12};
        i1.sortArray(array);

        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
