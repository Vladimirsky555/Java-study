//Если поля не константы, то должны быть private
//Инкапсуляция - возможность работы с полями объекта через публичные методы
public class Person {

    private String mr = "Mr. ";
    private String name = "Vladimir";

    public String getName() {
        return mr + name;
    }
}
