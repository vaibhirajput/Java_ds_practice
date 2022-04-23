import java.util.ArrayList;

public class array_questions2 {
    public static void main(String[] args) {
        array_questions2 aq = new array_questions2();
        int [] arr = {5,2,6,8,9,20,25,2,7,4};
        aq.arrayeven(arr);
    }
    // One array to separate two different array one array is even number array and second is odd number array.
    public void arrayeven(int []arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }
        System.out.print("Even no array is -> ");
        int sumeven=0;
        for (int no : even){
            sumeven= sumeven+no;
            System.out.print( no +" ");
        }
        System.out.println();
        System.out.println(sumeven);
        System.out.println(" Even array size is " +even.size());

        System.out.println();
        System.out.print("Odd no of array is -> ");
        for (int no: odd){
            System.out.print(no+" ");
        }
    }
}
