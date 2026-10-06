/* moving zeroes to last */
public class miscellaneous{
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,12};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[j]<arr[i]){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
           
    }        
}