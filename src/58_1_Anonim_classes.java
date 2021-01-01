import com.sun.security.jgss.GSSUtil;

/*
Используется полиморфизм
Создание анонимного класса

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
    public static void main(String[] args) {
        //Создаётся новый класс, наследуется от Popcorn, но с переопределённым
        //методом doSomething
        Popcorn popcorn = new Popcorn(){
            void doSomething(){
                System.out.println("main");
            }
        };
        popcorn.doSomething();
        popcorn.secondMethod();

        //Создание объекта и вызов метода без переопределения
        Popcorn popcorn1 = new Popcorn();
        popcorn1.doSomething();
    }
}
