import java.util.Scanner;

public class twoDArrSum {
    static int[][] arrSum(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("invalid input sumation not possible!!");
            return null;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of rows in first matrx:");
        int r1 = sc.nextInt();
        System.out.println("number of col in first matrx:");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("number of rows in second matrx:");
        int r2 = sc.nextInt();
        System.out.println("number of col in second matrx:");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] sum = arrSum(a,r1,c1,b,r2,c2);
        System.out.println("the sum matrix is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
