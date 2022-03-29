import java.util.Scanner;
import java.util.ArrayList;
public class Deram11 {
    public  static void show1() {
        Scanner in = new Scanner(System.in);
        ArrayList user = new ArrayList();

         user.add(0, in.nextInt());
         user.add(1, in.nextInt());
         for (int i=0; i<user.size(); i++)  {
             System.out.println(user.get(i));
         }
             System.out.println(user.get(1));
         }


       public static void main(String[] args) {
       show1();


    }
}