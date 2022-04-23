import java.util.HashSet;

public class array_question5 {
    public static void main(String[] args) {
        array_question5 aq5 = new array_question5();
        int [] arr1 = {4,5,6,4,8,9,4,2,4};
        int [] arr2 = { 8,1,2,4,5,3,8,9,7};
        aq5.common(arr1,arr2);
    }
    // Find common elements in two different array.
    public void common(int [] arr1, int [] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i< arr1.length; i++){
            for (int j=0; j< arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    hs.add(arr2[j]);
                    break;
                }
            }
        }
        System.out.print("Common elements in two array is -> ");
        for (int no : hs){
            System.out.print(no+ " ");
        }
    }
}
