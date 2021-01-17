import java.lang.Exception;


public class Main {
    public static void main(String[] args) {
        new Main().someMethod();
        System.out.println("after method");
    }

    void someMethod(){
        try{
            System.out.println("try");
            //System.exit(0);//всё что ниже не выполнится
            Object o = null;
            throw new Error();//finally выполнится
            //o.hashCode();
        } finally {
            System.out.println("finally");
//            throw new Error();
//            throw new RuntimeException();
        }
    }
}