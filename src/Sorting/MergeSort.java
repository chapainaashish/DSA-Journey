package Sorting;

public class MergeSort {

    public void mergeSort(int array[],int l, int h){
        if(l<h){
            int mid = l+h/2;
            mergeSort(array, l, mid);
            mergeSort(array, mid+1, h);
            sort(array, l, mid, h);
        }
    }

    public void sort(int array[], int l, int mid, int h){
        int j=mid+1, i=l;
        int[] array2 = {};
        for (int k=l;k<=h;k++){

            if(i>mid){
                array2[k]=array[j];
                j++;
            }

            else if(j>h){
                array2[k]=array[i];
                i++;
            }

            else if(array[i]>array[j]){
                array2[k]=array[j];
                j++;
            }

            else if (array[i]<array[j]){
                array2[k]=array[i];
                i++;
            }

        }

        for(int k=0; k<=h; k++){
            array[k]=array2[k];
        }
    }

    public static void main(String[] args) {
        MergeSort m1 = new MergeSort();
        int array[]={50, 3,2,1};
        m1.mergeSort(array,0,3);

        for(int k=0; k<=3; k++){
            System.out.println(array[k]);
        }
    }
}
