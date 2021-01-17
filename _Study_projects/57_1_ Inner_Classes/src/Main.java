import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/*
Внутренние классы тесно связаны с внешним классом
В десктопных приложениях для обработки нажатий на кнопки используют
1) Внутренние классы
2) Анонимные классы

Основная идея в том, что существуют внутренние классы, экземпляр которых мы не можем создать
без экземпляра внутреннего
 */

public class Main {

    private int i = 5;
    static int q = 7;

    Inner inner3 = new Inner();//внутренний класс Inner может быть полем

    //не является внутренним, не имеет доступ к переменным класса Main
    static class StaticClass{
        static void staticMethod(){
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        StaticClass.staticMethod();//запускаем статический метод статического класса

        Main main = new Main();
        main.method1();

        //Второй способ создания внутреннего класса из статического метода
//        Inner inner = main.new Inner();
//        inner.method2();
//
//        Second second = new Second();
//        second.method();

    }

    void method1(){
//        Inner inner = new Inner();
//        inner.method2();
        inner3.method2();

        System.out.println(inner3.k);
    }


    //Внутренний класс
    class Inner{
        private int k = 6;

        void method2(){
            System.out.println(i);
            System.out.println(q);
        }
    }
}

//Создание объекта внутреннего класса из другого класса
class Second{
    void method(){
        Main.Inner inner = new Main().new Inner();
        inner.method2();
    }
}

