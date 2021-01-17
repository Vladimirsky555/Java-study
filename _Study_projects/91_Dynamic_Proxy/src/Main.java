/*
InvocationHandler - объект, который будет реализовать наш новый интерфейс
Область использования:
1) Имплементация интерфейсов
2) Аспектно-ориентированное программирование
Разбитие идёт не на объекты, а на аспекты
Пример: делаем сайт.
1 аспект - регистрация и логирование пользователя
2 аспект - отправка сообщений
В одном коде мы не можем написать логирование и отправку сообщений, так как это разные аспекты
Мы пишем код на каждый аспект

Допустим у нас есть интерфейс, который отвечает за логирование.
Мы создайм Proxy, логируем юзера

С 9:16 продолжить
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        InvocationHandler handler = new MyProxy();
        Class[] classes = new Class[]{Comparable.class, Callable.class};
        Object proxy = Proxy.newProxyInstance(null, classes, handler);

        //Возможности
        proxy.getClass();
        proxy.toString();
        ((Comparable)proxy).compareTo(new Object());
    }

    static class MyProxy implements InvocationHandler {

        public MyProxy() {

        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //Возможности
            System.out.println(args);
            return null;
        }
    }
}
