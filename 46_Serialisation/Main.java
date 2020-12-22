import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
Статические поля не сериализуются.
Мы сериализуем и десериализуем объекты, а не классы. Статические поля характеристика класса,
а не объекта.

 */

public class Main {
//        public static void main(String[] args) throws Exception{
//        User user = new User();
//        user.setLiveLevel(55);
//        user.staticField = 45;
//
//        Sword sword = new Sword();
//        sword.level = 5;
//        user.sword = sword;
//
//        FileOutputStream fo = new FileOutputStream("tmp");
//        ObjectOutputStream os = new ObjectOutputStream(fo);
//        os.writeObject(user);
//        os.close();
//
//        user.staticField = 35;
//
//        FileInputStream fi = new FileInputStream("tmp");
//        ObjectInputStream oi = new ObjectInputStream(fi);
//        User newUser = (User) oi.readObject();
//        oi.close();
//
//        System.out.println(newUser.getLiveLevel());
//        System.out.println(newUser.staticField);
//        //System.out.println(newUser.sword.level);//Если Sword наследуется от Serealizable
//        System.out.println(newUser.sword);
//    }

    //Сериализация унаследованных классов
    public static void main(String[] args) throws Exception {
        UserChild user = new UserChild();
        user.setLiveLevel(55);
        user.staticField = 45;

        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;
        user.childLevel = 65;

        FileOutputStream fo = new FileOutputStream("tmp");
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(user);
        os.close();

        user.staticField = 35;

        FileInputStream fi = new FileInputStream("tmp");
        ObjectInputStream oi = new ObjectInputStream(fi);
        UserChild newUser = (UserChild) oi.readObject();
        oi.close();

        System.out.println(newUser.getLiveLevel());
        System.out.println(newUser.staticField);
        System.out.println(newUser.sword);//Если Sword не наследуется от Serealizable
        System.out.println(newUser.childLevel);
    }

}
