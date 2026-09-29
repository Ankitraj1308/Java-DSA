import java.util.Scanner;
public class matrixMul {
    

    static int[][] multiply(int[][] a, int[][] b) {

        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible!");
            return null;
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] result = multiply(a, b);

        if (result != null) {
            System.out.println("Result:");
            printMatrix(result);
        }

        sc.close();
    }
}

