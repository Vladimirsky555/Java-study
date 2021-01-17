public class Car {
    //Переменные класса по умолчанию имеют значения
    //Если boolean - false, переменные классов NULL
    //ПОЛЯ КЛАССА
    final int maxSpeed;
    Magnitophon mag;

    //Конструктор
    //Финальную переменную мы можем инициализировать в конструкторе
    Car(int maxSpd){
     maxSpeed = maxSpd;
    }


    void method(){
//        maxSpeed = 6;
        //ЛОКАЛЬНЫЕ ПЕРЕМЕННЫЕ
        //применяется только final
        final int i = 8;//переменная внутри метода нуждается в инициализации
    }
}
