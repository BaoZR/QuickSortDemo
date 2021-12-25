import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {6, 8, 3, 7, 2, 10, 1, 9, 5, 4};
        quickSort(arr, 0,arr.length-1);
        Arrays.stream(arr).forEach(i->System.out.println(i));
    }
    static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {return;}
        int i = start,j = end;
        int pivot = arr[i];
        while(i < j){
            if( i<j && pivot<arr[j]){j--;}
            if(i == j){break;}
            arr[i] = arr[j];i++;
            if( i<j && arr[i] < pivot){i++;}
            if(i == j){break;}
            arr[j] = arr[i];j--;
        }
        arr[i] = pivot;
        quickSort(arr,start,j-1);
        quickSort(arr,j+1,end);
        return;
    }


}
