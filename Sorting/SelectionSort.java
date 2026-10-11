package Sorting;

public class SelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_value = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_value]){
                    min_value=j;
                }
            }
            if(min_value!=i){
                int temp = arr[i];
                arr[i] = arr[min_value];
                arr[min_value] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,1,0};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(arr[i]+" ");
        }
    }
}
