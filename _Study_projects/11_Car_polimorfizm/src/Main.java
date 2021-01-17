//Полиморфизм - в рантайме определяется какой метод вызывать
//Если метод статический, компилятор его вызывает, если нет, то
//вызов идёт из списка методов. В нашем случае два одинаковых метода в классах
//Car и Toyota
//То есть мы динамически вызываем код из классов-наследников


public class Main {

    void useCar(Car car){
        car.driving();
        System.out.println(car.getNumOfSpeed());
    }

    public static void main(String[] args){
      Main m = new Main();
      //Car car = new Car();
//        Car car = new Toyota();
        Car car = new MonoWheel();
      m.useCar(car);
    }


}
