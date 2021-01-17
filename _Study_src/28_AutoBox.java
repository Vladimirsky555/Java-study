import java.util.ArrayList;

public class AutoBox {
    public static void main(String[] args) {
//       int i;
//       byte b;
//       short s;
//       long l;
//       boolean by;
//       char ch;
//       float f;
//       double d;
//
//       Byte bt;
//       Short st;
//       Integer inr;
//       Long ln;
//       Boolean bl;
//       Character c;
//       Float fl;
//       Double db;

       //List<Integer> listInt;//одна из целей обёрток - создание списков
//        Integer g = new Integer("5");
//        Integer t = new Integer(7);
//        int in = Integer.parseInt("3432534");//возвращает Integer
//        int q = Integer.valueOf("323425");//возвращает int
//
//        System.out.println(g);
//        System.out.println(t);
//        System.out.println(in);
//        System.out.println(q);

//        Integer g = new Integer("5");
//        String str = "43243";
//        int q = Integer.valueOf(str);
//        int q = g.valueOf(str);
//        System.out.println(q);

        //Автобоксинг
        Integer i = 5;//Integer i = new Integer(5);
        i++;
        //Как действует компилятор при инкременте
//        int tmp = i.intValue();//Превращение объекта в примитивное значение
//        tmp++;//инкремент
//        i = new Integer(tmp);//создание объекта после инкремента
        System.out.println(i);
    }

//    Object method(){
//        return new Integer(1);
//    }
}
