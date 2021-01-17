package Two;

import One.TestClass;

//public class OtherClass {
//    void method(){
//        TestClass test = new TestClass();
//        System.out.println(test.m);
//        System.out.println(test.getI());
//    }
//}

//Переменные или методы помеченные модификатором доступа protected видны в классах, которые
//наследуют эти классы
public class OtherClass extends TestClass{
    void method(){
        j = 9;
    }
}
