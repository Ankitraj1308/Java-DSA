import java.util.Scanner;

public class spiralMatTrav {
    static void spiralTraversal(int[][] matrix,int r,int c){
        int toprow=0, botomrow=r-1, leftcol=0, rightcol=c-1;
        int totalcount=0;
        while(totalcount<r*c){
            //toprow
            for(int i=leftcol; i<=rightcol && totalcount<=r*c; i++){
                System.out.print(matrix[toprow][i]+" ");
                totalcount++;
            }
            toprow++;
            //rightcol
            for(int i=toprow; i<=botomrow && totalcount<=r*c; i++){
                System.out.print(matrix[i][rightcol]+" ");
                totalcount++;
            }
            rightcol--;
            //botomrow
            for(int i=rightcol; i>=leftcol && totalcount<=r*c; i--){
                System.out.print(matrix[botomrow][i]+" ");
                totalcount++;
            }
            botomrow--;
            //leftcol
            for(int i=botomrow; i>=toprow && totalcount<=r*c; i--){
                System.out.print(matrix[i][leftcol]+" ");
                totalcount++;
            }
            leftcol++;
            
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralTraversal(matrix, r, c);
        sc.close();
    }
}
