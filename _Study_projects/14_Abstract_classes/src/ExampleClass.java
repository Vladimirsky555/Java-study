//Публичный класс может быть один. Его имя должно совпадать с именем файла
/*
Модификаторы доступа, которые можно добавлять к классу
strictfp - strict floating point
public
abstract - не можем создать экземпляр класса
final - мы не можем наследовать этот класс
 */



//public class ExampleClass {
public class ExampleClass {//дефолтный
}

//float-Значения будут более точно считаться
strictfp class SomeClass{
   void method(float f){

   }
}

//Используется для классов, которые давным давно написаны. Чтобы не переопределять эти методы
//abstract и final не могут использоваться в одном классе
final class MySecondClass{
    void someLogic(){

    }
}

class MyThirdClass {
}
