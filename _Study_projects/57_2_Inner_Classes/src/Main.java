import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/*
Внутренние классы на уровне методов

Итак 3 вида внутренних классов:
1) Обычные классы
2) Статические классы
3) Внутренние классы на уровне методов (ограничены, можем только создать экземпляр и вызвать метод)
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.method();
    }

    void method() {
        class NewInner {
            void NewMethod() {
                System.out.println("bla");
            }
        }

        NewInner ni = new NewInner();//Экземпляр класса создаётся после объявления класса в методе
        ni.NewMethod();
    }

}

