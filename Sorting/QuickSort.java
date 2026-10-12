package Sorting;

public class QuickSort {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;
        for(int i=st+1; i<=end; i++){
            if(arr[i]<pivot){
                count++;
            }
        }
        int pivotidx = st+count;
        swap(arr,st,pivotidx);
        int i=st, j=end;
        while(i<pivotidx && j>pivotidx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j++;

            if(i<pivotidx && j>pivotidx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotidx;

    }

    static void quickSort(int[] arr,int st,int end){
        if(st>=end) return;

        int pi = partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,5,1};
        int n =arr.length;
        System.out.println("Before sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        quickSort(arr, 0, n-1);
        System.out.println();
        System.out.println("After sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
