public class array_question4 {
    public static void main(String[] args) {
        array_question4 aq4 = new array_question4();
        int [] arr = {1,2,3,5,7};
        aq4.find(arr);
    }
        // This method is finding missing number.
        // but the condition is number start from 1 and number is in sequence oder .example-1,2,3,5.
    public void find(int[] arr){
        int max_elements = arr.length+1;
        int total_elements = max_elements* (max_elements+1)/2;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Missing element in array is -> "+ (total_elements - sum));
    }
}
