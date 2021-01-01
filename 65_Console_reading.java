import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception {
        //Console console = System.console();//используем системную консоль
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals("exit")){
//            s = console.readLine();
            s = scanner.nextLine();
            System.out.println(s);
        }
    }
}
