
 class MyClass {



    void method(){
        Car car = new Ferrary();
        car.run();
        car.stop();
    }

}

 abstract class Car{
    int speed;

    abstract void run();

    void stop(){
        speed = 0;
    }
}

class Ferrary extends Car{
    @Override
    void run() {
        speed = 25;
    }
}

class Honda extends Car{
    @Override
    void run() {
        speed = 20;
    }
}
