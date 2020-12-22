//Интерфейс абстрактный класс
//Используется для описания какого-то поведения, например прыгучесть
//Задавать индекс прыгучести

/*
Почему мы не используем абстрактные классы. Классы используются для описания объектов.
Интерфейсы же обычно для описания поведения.
Конечно компилятор скомпилирует, но другие скажут, что мы говнокодеры.

Методы все автоматически публичные и абстрактные, но мы не пишем public и abstract
Все константы также публичные

Интерфейсы имплементятся, а не экстендятся

Можно имплементировать несклько интерфейсов через запятую, тогда
придётся переопределять все методы, которые в них есть
Это делается потому, что поведение объекта может быть разное
 */

interface ISomeInterface extends IOtherInterface{
//    public static final int SOME_VARIABLE = 5;
      int SOME_VARIABLE = 5;

   void addTwoDigits(int one, int two);
}

interface IOtherInterface {
    void someMethod();
}

interface Bancable {
    void bounce();
}

class Example implements ISomeInterface, Bancable{
    @Override
    public void addTwoDigits(int one, int two) {

    }

    @Override
    public void someMethod() {

    }

    @Override
    public void bounce() {

    }
}
