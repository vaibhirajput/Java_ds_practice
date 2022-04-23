import java.util.ArrayList;

public class array_question3 {

    public static void main(String[] args) {
        array_question3 aq3 = new array_question3();
        int [] arr= { 5,4,-5,8,-1,-6,2,-9};
        aq3.positive(arr);

    }
    // One array have positive and negative  elements in array. to separate positive and nagitive into two different array .
    public void positive(int [] arr){
        ArrayList <Integer> positive1 = new ArrayList<>();
        ArrayList<Integer> negative2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] >0){
                positive1.add(arr[i]);
            }
            else if (arr[i]<0){
                negative2.add(arr[i]);
            }
        }
        System.out.print("Positive array is -> ");
        for (int no : positive1){
            System.out.print(no+" ");
        }
        System.out.println();
        System.out.print("Nagitive array is -> ");
        for (int no : negative2){
            System.out.print(no+" ");
        }
    }
}
