class Parent{

    //Сначала запустятся статические блоки Parent
    static{
        System.out.println("static parent block");
    }

    {
        System.out.println("parent init block");
    }

    Parent(){
        System.out.println("parent constructor");
    }
}


public class InitExample extends Parent {
    //Статический блок инициализации
    //Запуск - при первом обращении к классу
    static {
        System.out.println("static init block 1");
    }
    //Обычный блок инициализации
    //Запуск - при создании экземпляра класса
    {
        System.out.println("init block 1");
    }
    {
        System.out.println("init block 2");
    }
    {
        System.out.println("init block 3");
    }
    {
        System.out.println("init block 4");
    }

    //Конструктор
    //Запускает сначала родительский конструктор, потом запускается сам
    InitExample(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
      new InitExample();
    }

    static {
        System.out.println("static init block 2");
    }
}
