public class StaticExmpl {

    static int i;

    StaticExmpl(){
        i++;
        System.out.println("Constructor");
    }

    static{
        System.out.println("static initializer");
    }
    {
        System.out.println("initializer");
    }

    static void staticMethod(){
        System.out.println("static method");
    }


    public static void main(String[] args) {
        new StaticExmpl();
        new StaticExmpl();
        new StaticExmpl();
        new StaticExmpl();
        System.out.println(StaticExmpl.i);
    }
}
