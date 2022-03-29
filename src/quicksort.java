public class quicksort {
    public static void main(String[] args) {
        int [] arr = { 45,112,85,2,45,78,1,5,98,23,11};
        int l = 0;
        int h = arr.length;
        quick1(arr, l, h);
    }
    public static void quick1(int [] arr, int l, int h){
        int mid = (l+h)/2;
        while (arr[l]< arr[mid]){
            l++;
        }
        while (arr[h]> arr[mid]){
            h++;
        }
        int temp = arr[l];
        arr[l]= arr[h];
        arr[h] = temp;
        l++;
        h++;


    }
}
