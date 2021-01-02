/*
Объект мы создали только один раз. Второй раз мы инициализировали
второй объект по ссылке первого.
Метод clone написан на С++
Clonable - маркерный класс. Сообщаем джава-машине, что собираемся клонировать класс

Клонирование бывает поверхностное и глубокое
Поверхностное клонирует примитивные типы
 */

public class Main {
    public static void main(String[] args) throws Exception{
        MyObject mo1 = new MyObject();
        mo1.i = 1;

        //MyObject mo2 = mo1;//результат 2
        MyObject mo2 = mo1.clone();//результат 1
        mo2.i = 2;

        System.out.println(mo1.i);
    }
}


class MyObject implements Cloneable{
    int i;

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject)super.clone();
    }
}

