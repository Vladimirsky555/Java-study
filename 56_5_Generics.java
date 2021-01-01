import java.io.*;
import java.util.*;

/*
Хранение данных в Обобщённых классах
 */



public class Main <T extends Main & Comparable & Serializable>{


    public static void main(String[] args) throws Exception{
        //Параметризованные, можем добавить в массив только один тип классов
        List<String> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        List<Main> list3 = new ArrayList<>();

        //Непараметризованный, можно добавить что угодно
        //В цикле при приведении к одному типу, код не заработает
        List list4 = new ArrayList();

        //Пробегание по параметризироанной коллекции
        List<File> fList = new ArrayList<>();
        for(File o : fList){
            File f = o;
        }
    }





}