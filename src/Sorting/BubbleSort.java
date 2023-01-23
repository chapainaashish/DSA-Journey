package Sorting;

public class BubbleSort {

    public void sortArray(int[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=i; j<array.length-1; j++){
                if(array[i]>array[j]){
                    int temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort b1 = new BubbleSort();
        int array[] = {10,8,6,6,11};
        b1.sortArray(array);
        for (int i=0; i<= array.length-1; i++){
            System.out.println(array[i]);
        }
    }
}
