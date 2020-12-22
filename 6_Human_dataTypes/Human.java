class Human {
    //Встроенные типы
    //Целочисленные типы
    byte b;//1 байт (256 значений) -128 +128
    short s;//2 байта(65000 значений) -32000 +32000
    int age = 45;//4 байта(около 4 млрд значений) 2 млрд +2 млрд
    long l;//8 байтов памяти (2^63 знач)

    //С запятой
    float f = (float)2.5;//4 байта
    double d = 3.456;//8 байтов
    boolean bool = true;//
    char c = 'f';

    //Ссылочные типы (классы)
    Human mother = new Human();
    Human father;
    Car volga = new Car();

    public static void main(String[] args){

    }


}
