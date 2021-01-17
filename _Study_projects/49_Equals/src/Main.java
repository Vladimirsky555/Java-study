public class Main extends Object {
    int value = 5;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.toString());//вывод информации об объекте Main@568db2f2
        System.out.println(main + "");//то же самое
    }

    //Переопределение методов класса Object
    @Override
    public String toString(){
        return value + "Main";
    }
}
