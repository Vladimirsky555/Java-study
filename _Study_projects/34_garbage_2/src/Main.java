import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/*
Когда нет ссылок срабатывает коллектор.
Если ссылки остаются на объекты, то он не запускается.
 */

public class Main extends Object {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("total memory before " + runtime.totalMemory());
        System.out.println("free memory before " + runtime.freeMemory());

        List<Date> dateList = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            Date date = new Date();
//            date = null;
            dateList.add(date);
        }

        dateList = null;

        System.out.println("total memory after " + runtime.totalMemory());
        System.out.println("free memory after " + runtime.freeMemory());

        System.gc();//нет гарантии запустится он или нет

        System.out.println("total memory after gc " + runtime.totalMemory());
        System.out.println("free memory after gc " + runtime.freeMemory());
    }

    //Запускается при запуске garbage collector
    @Override
    public void finalize(){
        System.out.println("AAAAAAAAAAAAAA");
    }
}
