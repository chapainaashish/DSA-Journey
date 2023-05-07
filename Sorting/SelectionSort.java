package Sorting;

public class SelectionSort {

    public void sortArray(int array[]){
        for (int i=0; i<array.length;i++){
            int mi = i;

            for(int j=i; j<array.length; j++){
                if (array[mi]>array[j])
                    mi=j;
            }

            int temp = array[i];
            array[i] = array[mi];
            array[mi]=temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort s1 = new SelectionSort();
        int array[] = {10,7,8,11,3,3};
        s1.sortArray(array);

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
