//Идентификатор начинается со знака доллара, с нижнего подчеркивания или с буквы, но не с цифры
//Имена классов с большой буквы
//Интерфейсы описываются прилагательным от того, что он делает

public class Main {

    int camelCase;
    void myMethodIsLongName(){}

    public static void main(String[] args){
        Person vasya = new Person();
        vasya.setName("Вася");
        vasya.setBlond(true);

        Person kolya = new Person();
        kolya.setName("Коля");
        kolya.setBlond(false);

        System.out.println(vasya.getName());
        System.out.println(kolya.getName());
    }
}
