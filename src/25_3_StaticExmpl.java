///*
//1) Сначала инициализируется переменная
//2) Потом статические инициализаторы включаются
//3) При появлении экземпляра класса инициализируются нестатические поля - запускается
//   инициалайзер, а потом конструктор
//4) Инициалайзеров может быть несколько, они будут запускаться по очереди
// */
//
//public class StaticExmpl {
//
//    static int i = 6;
//    int j;
//    int b = 5;
//
//    StaticExmpl(){
//        System.out.println("Constructor");
//    }
//
//    static{
//        System.out.println("static initializer");
//    }
//    {
//        System.out.println("initializer");
//    }
//    {
//        System.out.println("second initializer");
//    }
//
//    static void staticMethod(){
//        System.out.println("static method");
//    }
//
//
//    public static void main(String[] args) {
//
////        System.out.println(StaticExmpl.i);
//        staticMethod();
//        new StaticExmpl();
//        new StaticExmpl();
//    }
//}
//
