public class OverloadingExmpl {
    public static void main(String[] args) {
      OverloadingExmpl oe = new OverloadingExmpl();

      short s = 5;
      //преобразуется к ближайшему целочисленному
        /*
        1) к примитивам
        2) автобоксинг, преобразование к объекту Short
        3) к Object (так как он родитель)
        4) к Object... или Short...
        5) к short..., к списку short
         */

      oe.method(s);
    }

    void method(int i){
        System.out.println("int");
    }
    void method(long i){
        System.out.println("long");
    }
    void method(Integer i){
        System.out.println("integer");
    }
    void method(double i){
        System.out.println("double");
    }
    void method(float i){
        System.out.println("float");
    }
    void method(byte... i){
        System.out.println("byte...");
    }
    void method(byte i){
        System.out.println("byte");
    }
    void method(Byte i){
        System.out.println("Byte");
    }
    void method(Object i){
        System.out.println("object");
    }
    void method(Object... i){
        System.out.println("Object...");
    }
    void method(Short i){
        System.out.println("Short");
    }
    void method(short... i){
        System.out.println("short");
    }
    void method(short i){
        System.out.println("short");
    }
}
