public class AutoBox {
    public static void main(String[] args) {
        String s = "string";
        String s2 = "string";

        Object o1 = new Object();
//        Object o2 = new Object();
        Object o2 = o1;

        //При сравнении объектов всегда разные
        //Поэтому используем метод equals
        if(o1 == o2){
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

        //метод equals для строк уже переопределён
        if(s.equals(s2)){
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        //сравнивает в одном месте памяти находятся объекты или нет
        if(s == s2){
            System.out.println("s = s2");
        } else {
            System.out.println("s != s2");
        }
    }
}

class MyClass{
    public boolean equals(Object obj){
        return this == obj;
    }
}