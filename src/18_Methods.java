/*
Модификаторы для методов:
private
public
protected

native - используется в пустых методах. Говорим, что метод был реализован на C++. И компилятор должен использовать
         другие библиотеки
strictfp - если хотим с определенной точностью использовать float point, используем этот модификатор
synchronized - метод выполняет один поток в один момент времени. Если не хотим чтобы несколько потоков его испол
final - этот метод не будет переопределён
abstract - нет тела, этот метод нужно переопределить в наследниках
static -

 */


public class Example {
    static int i = 5;
    //массив Int...
    //1) может быть только один
    //2) может быть последним параметром
   static void method(int i, float f, boolean b, Object o, String s, int... j){
     System.out.println(i);
       System.out.println(f);
       System.out.println(b);
       System.out.println(o);
       System.out.println(s);
       for(int k : j) {
           System.out.println(k);
       }
    }

    static Object method2(){
       return new Object();
    }
}

class otherExample{
    public static void main(String[] args){
        Example.method(3, 3.14f, true, new Object(), "Привет", 6, 7, 9);
        System.out.println(Example.method2());
    }
}
