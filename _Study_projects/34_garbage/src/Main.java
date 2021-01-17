import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dt = method();
        dt = null;//ссылок нет, date будет удалён
        System.gc();//вызов garbage collector
        method2();
    }

   private static Date method(){
      Date date = new Date();
      Date date2 = date;
       System.out.println(date);
       return date;
    }

    public static void method2() {

    }
}
