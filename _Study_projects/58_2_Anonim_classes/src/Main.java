import com.sun.security.jgss.GSSUtil;

/*
Создание анонимного класса, унаследованного от интерфейса

 */


public class Main {
    public static void main (String[] args) throws Exception{
        //Создаётся новый класс, наследуется от Popcorn, но с переопределённым
        //методом doSomething
        Comparable comp = new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        comp.compareTo(new Object());
    }

}
