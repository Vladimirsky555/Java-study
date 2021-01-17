package One;

/*
4 уровня доступа:

private
protected - доступ на уровне пакета, как и default, такде используется при наследовании
default - доступ на уровне пакета
public

 */

public class TestClass {

    private int i = 5;
    protected int j = 6;
    int k = 7;
    public int m = 8;

    public int getI() {
        return i;
    }

    void method(){
        TestClass test = new TestClass();
        System.out.println(test.i);
    }
}

class TestModifiers{
    void method(){
        TestClass test = new TestClass();
        System.out.println(test.getI());
    }
}
