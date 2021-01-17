import com.Max.Car;
import com.Max.Plane;
//import com.Max.*;

public class Human
{
    int age = 22;
    Car car;
    Plane plane;

    public static void main(String[] args){
       Human human = new Human();
       System.out.println(human.getAge(5, 4.56, true, human));
    }

    double getAge(int i, double d, boolean b, Human human)
    {
        return human.age;
        //return human.getAge(i, d, b, human);//StackOverflowError
    }
}
