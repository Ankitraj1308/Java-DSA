package Sorting;

public class sortLexico {
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n; i++) {
            int min_value = i;
            for (int j = i+1; j < n; j++) {
                if(fruits[j].compareTo(fruits[min_value])<0){
                    min_value = j;
                }
            }
            if(min_value!=i){
                String temp = fruits[i];
                fruits[i] = fruits[min_value];
                fruits[min_value] = temp;
            }
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple","papaya","mango"};
        sortFruits(fruits);
        for(String val : fruits)
        System.out.print (val + " ");
    }
}
