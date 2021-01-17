package One.Three;

import One.TestClass;

//k и j по-прежнему не видны, хотя пакет в пакете
public class ThirdClass {
    void method(){
        TestClass test = new TestClass();
        System.out.println(test.m);
    }
}
