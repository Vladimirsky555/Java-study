import java.io.IOException;

public class Overload {
    //Перегруженные методы
    int addTwoDigits(int a, int b){
        return a + b;
    }

    double addTwoDigits(double a, double b){
        return a + b;
    }

    int addTwoDigits(){
        return 4;
    }
//    int addTwoDigits() throws Exception{
//        return 4;
//    }
//    int addTwoDigits() throws RuntimeException{
//        return 4;
//    }
//
//    int addTwoDigits() throws IOException {
//        return 4;
//    }

    public  static void main(String[] args){
//        Overload ov = new Overload();
        OverloadChild ov = new OverloadChild();
        System.out.println(ov.addTwoDigits(5,6));
        System.out.println(ov.addTwoDigits(4.43, 5.76));
        System.out.println(ov.addTwoDigits());
        ov.addTwoDigits(5);
    }

}

class OverloadChild extends Overload {
    //Перегруженный метод
    void addTwoDigits(int i){
        System.out.println("Overload class");
    }
}


