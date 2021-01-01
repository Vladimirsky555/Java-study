/*
Не перегружаем статические параметры (модификатор static)
Можно при перегрузке возвращать child
При добавлении exeption мы не можем в класс Child поместить родительских exeption, только производные, либо тот же
либо никакой
 */

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
//   int method(){
//        return 1;
//    }
    Parent method() throws IOException {
        return new Parent();
    }
}

class Child extends Parent{
    @Override
//    int method() {
//        return 2;
//    }

    Child method() throws FileNotFoundException {
        return new Child();
    }
}

//Полиморфный запуск методов
public class OverrideExample{
    public static void main(String[] args) throws Exception{
        Parent p = new Parent();
        Parent ch = new Child();

        System.out.println(p.method());
        System.out.println(ch.method());
    }
}