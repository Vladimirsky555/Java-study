import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("test.txt");
        if(!file.exists()){
//            file.mkdir();
            file.createNewFile();
//            System.out.println("exist");
        }
        if(file.isDirectory()){
            System.out.println("dir");
        }
        if(file.isFile()){
            System.out.println("file");
        }

        FileWriter writer = new FileWriter(file);
        writer.write("str1!\n");
        writer.write("str2!\n");
        writer.write("str3!\n");
        writer.flush();
//        writer.close();

        //Читает в массив байт
        FileReader reader = new FileReader(file);
//        char[] chars = new char[20];
//        reader.read(chars);
//        System.out.println(chars);

        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("str4");
        bw.newLine();
        bw.write("str5");
        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(reader);
        while (br.ready()){
            System.out.println(br.readLine());
        }
    }

//    public static void main(String[] args) throws Exception{
//        File f = new File("test.txt");
//        if(!f.exists()){
//            f.createNewFile();
//        }
//
//        FileWriter fw = new FileWriter(f);
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("str1");
//        bw.newLine();
//        bw.write("str2");
//        bw.flush();
//        bw.close();
//
//        FileReader fr = new FileReader(f);
//        BufferedReader br = new BufferedReader(fr);
//        while(br.ready()){
//            System.out.println(br.readLine());
//        }
//
//    }
}
