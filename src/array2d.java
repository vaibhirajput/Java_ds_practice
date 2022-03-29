
import java.util.Scanner;

public class array2d {

    public static void prime(int a){

        for( int i =2; i <a; i++){
            if (i %3 == 1){
                System.out.println(i);
            }
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int a = input.nextInt();
        prime(a);
    }
}
