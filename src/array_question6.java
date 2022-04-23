import java.util.HashSet;

public class array_question6 {
    public static void main(String[] args) {
        int [] arr1 = {4,5,6,8,2,1,10,4};
        int [] arr2 = {2,8,3,22,4,5,1,2};
        array_question6 aq6 = new array_question6();
        aq6.common1(arr1, arr2);
    }
    public void common1(int [] arr1,int [] arr2){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0; i< arr1.length; i++){
          hs1.add(arr1[i]);
          hs2.add(arr2[i]);
        }
        System.out.print("Common elements in array is -> ");
        for (int no : hs2){
            boolean duplicate = hs1.add(no);
            if (duplicate== false){
                System.out.print(no+" ");
            }
        }
    }
}
