import java.util.Scanner;
public class Demo {
    private String name;
    private int age;


    public void setAge(int age) {
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class Show{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Scanner in = new Scanner(System.in);

        d1.setAge(in.nextInt());
        d1.setName(in.next());
        System.out.println(d1.getAge());
        System.out.println(d1.getName());
    }
}
