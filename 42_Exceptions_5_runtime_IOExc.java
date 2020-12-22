import java.io.IOException;
import java.io.File;

/*
Когда передавать наверх, когда обрабатывать самим?
Если пишу код для других, то передавать, чтобы другие смогли обработать
Если для себя, то помещать в try-catch

Иерархия: Throwable -> Exception -> IOException
Исключения (Throwable - checked, Exception - checked, Error - unchecked)
1) RuntimeException - unchecked
2) IOException - checked

Резюме:
1) checked-exception либо отправлять наверх, либо обрабатывать
2) блоков catch может быть много, они могут быть вложенными
3) В конце может быть finally
4) finally выполняется всегда, если не было System.exit(0) или бесконечного цикла
 */

public class Main {

    //Runtime exception
    public static void main(String[] args) {
        System.out.println(args[5]);
        new Main().someMethod3();
        new Main().fileMethod();
    }

    //Передаём проблему ещё выше
//    public static void main(String[] args) throws Exception {
//        new Main().someMethod2();
//    }

    //Решаем проблему в методе someMethod2()
//    public static void main(String[] args) {
//      new Main().someMethod();
//
//      try {
//          new Main().someMethod2();
//      } catch (Throwable e){
//
//      }
//
//    }

    //1-й способ обработки checked-exception
    void someMethod(){
      //throw new RuntimeException();//anchecked
        try {
            throw new IOException();//checked (компилятор ругается, если не обработать её)
        } catch(IOException e){

        }
    }

    //2-й способ обработки checked-exception - передаёт проблему наверх, откуда метод вызван
    void someMethod2() throws Exception, IOException{
        throw new IOException();
    }

    void someMethod3(){
        try {
            throw new RuntimeException();//не отлавливается компилятором
        } catch (RuntimeException e){
            System.out.println("Runtime exception");//отловил
        }
    }

    void fileMethod() throws IOException{
        File file = new File("");
        file.createNewFile();
    }
}
