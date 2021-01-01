
public class Main {

    public static void main(String[] args) {
        //объект не меняется
//       String str = new String("abc");
//       str.concat("def");
//        System.out.println(str);

//        String str = new String("abc");
//        String str2 = str.concat("def");
//        System.out.println(str);
//        System.out.println(str2);

        StringBuilder sbuild;//
        StringBuffer sbuffer;//для работы с многопоточными приложениями

        //Если меняем часто строчки, использовать этот класс
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        sb.insert(0,"-");
        System.out.println(sb);
    }
}
