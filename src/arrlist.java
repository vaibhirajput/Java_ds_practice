import java.util.ArrayList;
import java.util.Collections;
public class arrlist {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("Hello vaibhv rajput");
        arr.add("age-21");
        arr.add("Hello vaibhv rajput");
        arr.add("age-22");
        arr.add("Hello vaibhv rajput");
        arr.add("age-23");
        arr.add("Hello vaibhv rajput");
        arr.add("age-24");
        arr.add("Hello vaibhv rajput");
        arr.add("age-27");
        arr.add("Hello vaibhv rajput");
        arr.add("age-25");
        arr.add("Hello vaibhv rajput");
        arr.add("age-21");
        arr.add("Hello vaibhv rajput");
        arr.add("age-21");
        aa(arr);
    }

    public static void aa(ArrayList arr){
        for (int a=0; a<arr.size();a++){
            System.out.println(arr.get(a));
        }
    }
}
