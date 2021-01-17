import java.lang.Exception;
/*
Код, который возможно будет с ошибкой, помещаем в блок try
Блок catch выполнится в случае исключения
 */

public class Main {
    public static void main(String[] args) {
        new Main().someMethod();
    }

    void someMethod(){
        try{
            System.out.println("try");
            Object o = null;
            o.hashCode();
//            throw new Exception();
        } catch (NullPointerException e){
            System.out.println("catch");
           e.printStackTrace();
        } finally {//Выполняется в любом случае (используется для закрытия доступа к базе данных)
            System.out.println("Finally");
        }
    }
}
