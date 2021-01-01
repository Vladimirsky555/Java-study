import com.sun.security.jgss.GSSUtil;

/*
Объявление анонимного класса в методе
 */

class Popcorn{
    void doSomething(){
        System.out.println("popcorn");
    }
    void secondMethod(){
        System.out.println("second");
    }
}

public class Main {
    public static void main (String[] args) throws Exception{
        method(new Popcorn(){
            void doSomething(){
                System.out.println("bla");
            }
        });
    }

    static void method(Popcorn popcorn){
        popcorn.doSomething();
    }
}
