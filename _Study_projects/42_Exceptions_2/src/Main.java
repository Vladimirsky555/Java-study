import java.lang.Exception;

/*
Код, который возможно будет с ошибкой, помещаем в блок try
Блок catch выполнится в случае исключения
Блок try не может быть сам по себе: либо с catch, либо с finally
Блог finally выполняется всегда
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().someMethod());
    }

    String someMethod(){
        try{
            System.out.println("try");
            Object o = null;
            o.hashCode();
            return "try2";
//            throw new Exception();
        } catch (NullPointerException e){
            System.out.println("catch");
//            e.printStackTrace();
            return "catch2";
        } finally {//Выполняется в любом случае (используется для закрытия доступа к базе данных)
            //System.exit(0);//прерывание выполнения программы
            System.out.println("Finally");
            return "finally";
        }
    }
}
