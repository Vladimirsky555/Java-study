public class StaticExmpl {
    static int i = 5;
    int j;

    StaticExmpl(){
        System.out.println("Constructor");
    }
    static{
        i = 7;
        System.out.println("static initializer");
    }
    {
        System.out.println("initializer");
    }

    static void staticMethod(){
        i = 8;
        System.out.println("static method");
    }


    public static void main(String[] args) {
//     StaticExmpl se = new StaticExmpl();
//     StaticExmpl se2 = new StaticExmpl();
//     se.j = 1;
//     se2.j = 2;
//     System.out.println(se.j);
//     System.out.println(se2.j);

        System.out.println(StaticExmpl.i);
        StaticExmpl.staticMethod();
        System.out.println(StaticExmpl.i);
    }
}
