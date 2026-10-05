import java.util.Scanner;
public class spiralMatrix {
    static int[][] spiralValueMatrix(int[][] matrix,int n){
        int tr=0, br=n-1, lc=0, rc=n-1;
        int value = 1;
        while(value<=n*n){
            for(int i=lc; i<=rc && value<=n*n; i++){
                matrix[tr][i]=value;
                value++;
            }
            tr++;
            for(int i=tr; i<=br && value<=n*n; i++){
                matrix[i][rc]=value;
                value++;
            }
            rc--;
            for(int i=rc; i>=lc && value<=n*n; i--){
                matrix[br][i]=value;
                value++;
            }
            br--;
            for(int i=br; i>=tr && value<=n*n; i--){
                matrix[i][lc]=value;
                value++;
            }
            lc++;
            
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        matrix = spiralValueMatrix(matrix, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
