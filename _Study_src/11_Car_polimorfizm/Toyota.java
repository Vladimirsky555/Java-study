
public class Toyota extends Car{
    @Override//Анотация о том, что мы переопределяем метод в родителе
    public int getNumOfSpeed() {
        return 2;
    }
}
