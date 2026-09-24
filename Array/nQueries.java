import java.util.Scanner;

public class nQueries {
    static int[] freqArr(int[] arr){
        int[] freq = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,4,7,34,64,25};
        System.out.println("enter the number of queries:");
        int n = sc.nextInt();
        int[] freq=freqArr(arr);
        while(n>0){
            System.out.println("enter number to check:");
            int num = sc.nextInt();
            if(freq[num]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            n--;
        }
        sc.close();
    }
}
