

public class Main {
//    static Main main;
    public static void main(String[] args) {
        method();
    }

    //Когда нет ссылок и запускаем gc, то он срабатывает
    public static void method(){
      Main main = new Main();
      Main main2 = new Main();
      main = null;
      main2 = null;
      System.gc();
    }

    @Override
    public void finalize() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAA");
//        Main.main = this;//Объект удаяется, а ссылка сохраняется
    }
}
