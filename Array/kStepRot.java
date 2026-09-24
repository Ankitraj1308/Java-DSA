public class kStepRot{
    static int[] rotatingArray(int[] a, int k){
        int n = a.length;
        k = k%n;
        int j=0;
        int[] ans = new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=a[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=a[i];
        }
        return ans;

    }

public static void main(String[] args){
    int[] a = {1,2,3,4,5,6,7};
    int[] rev = rotatingArray(a,5);
    for (int i = 0; i < rev.length; i++) {
        System.out.print(rev[i]);
    }
    System.out.println();
}



}