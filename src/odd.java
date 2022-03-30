import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 10,20,30,10,50,20};
        int num = sc.nextInt();
        int count = 0;
        for (int i =0; i <= arr.length-1;i++){
            if (arr[i] == num){
               count++;
            }
        }
        System.out.println(count);
    }
}


