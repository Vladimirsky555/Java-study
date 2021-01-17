import java.io.IOException;
import java.lang.Exception;

/*
Сначала отлавливаем более конкретные эксепшены, потом менее
Сначала ArrayIndexOutOfBoundsException, потом RuntimeException
Так как RuntimeException родитель для ArrayIndexOutOfBoundsException

Иерархия:
1) Throwable - суперкласс всех error и exception
Error это индикатор серьезных проблем, которые не рекомендуется отлавливать.
Их можно отлавливать, но не рекомендуется.
Исключения:
1) Runtime exception
2) IOException
 */

public class Main {
    public static void main(String[] args) {
        new Main().someMethod();
        new Main().errorMethod();
        System.out.println("after method");
    }

    void someMethod(){
        try{
            System.out.println("try");
            throw new IOException();
            //System.exit(0);//всё что ниже не выполнится
            //Object o = null;
            //throw new Error();//finally выполнится
            //o.hashCode();
        } catch (ArrayIndexOutOfBoundsException e){
            try{
//               throw new ArrayIndexOutOfBoundsException();
                throw new RuntimeException();
            }catch (ArrayIndexOutOfBoundsException err){

            }
        } catch (IOException e){

        } catch (RuntimeException e){

        } finally {

        }

        //При написании своих библиотек может пригодиться
        //проще свалить программу, чем она будет продолжаться
        try{
          throw new MyException();
        }catch (MyException e){
            System.out.println("catch");
        }
    }

    //Отлавливание error
    void errorMethod(){
        try{
//            throw new Error();
        }catch (Error e){
            System.out.println("catch");
        }
    }
}

