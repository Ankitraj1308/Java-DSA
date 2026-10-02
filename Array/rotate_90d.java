import java.util.Scanner;

public class rotate_90d {
    static void transpose(int[][] arr,int r,int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void swap(int[] arr,int n){
        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    static int[][] rotate(int[][] matrix , int n){
        transpose(matrix, n, n);
        for (int i = 0; i < matrix.length; i++) {
            swap(matrix[i], n);
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        matrix = rotate(matrix, c);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
