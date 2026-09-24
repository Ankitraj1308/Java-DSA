/*
Rotate the given array 'a' by k steps, where k is non-negative 
without using extra space.
*/
public class kStepRot2 {
    static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void reverse(int[] a, int i,int j){
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }

    static int[] revArrayKstep(int[] a,int k){
        int n = a.length;
        reverse(a, n-k, n-1);
        reverse(a, 0, n-k-1);
        reverse(a, 0, n-1);

        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        revArrayKstep(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
     }
}
