class MyParent{
    /*
    Если родительский констрктор будет с параметром, то компилятор выдаст ошибку.
    Разрешить ситуацию:
    1) Добавить дефолтный конструктор MyParent()
    2) В конструктор ребёнка добавить super(5) к примеру, то  есть добавить параметр
     */
    MyParent(int i){
        System.out.println("MyParent constructor with paremeter");
    }

   MyParent(){
       System.out.println("MyParent default constructor");
   }
}

public class ConstructorExample extends MyParent {
    ConstructorExample(){
        //super(4);//вызов родительского конструкора с параметром
        //this(4);//вызов конструктора с параметром
        System.out.println("Constructor Example");
    }
    ConstructorExample(int i){
        super();//Строчку, которую добавляет компилятор
    }

    public static void main(String[] args){
        ConstructorExample ce = new ConstructorExample();
    }
}
