/*
assert проверяет аргументы. Используется если они должны быть такими и никакими
иначе. Выбрасывается asserttionError
В реальных программах assert убирается
По умолчанию ассерты отключены
Для включения нужно отредактировать конфигурацию, добавив -ea в VM options
В релизе все assert убираются
 */

public class Main {
    public static void main(String[] args) {
        new Main().someMethod(-5);
    }

    private void someMethod(int a){
        assert (a > 0);
        System.out.println(a);
    }
}
