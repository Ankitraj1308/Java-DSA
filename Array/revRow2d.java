public class revRow2d {
    static int[] revArray(int[] a){
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[][] arr ={
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
                    };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = revArray(arr[i]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            
            }
            System.out.println();
        }
        
    }
}
