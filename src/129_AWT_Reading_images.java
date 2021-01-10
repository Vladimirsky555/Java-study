import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/*
1) Правильно проверить какие форматы есть
2) Создать reader для чтения определённого формата

BufferedImage - главный класс для работы с изображениями
ImageIO - основная утилита для чтения файлов

Файлы с изображениями можно тупо читать из файлов, но по правилам, чтобы программа не
завершилась, необходимо создавать reader для чтения и writer для записи, где прописывать формат,
в котором будет осуществляться чтение или запись. 
 */

public class Main {

    public static void main(String[] args) throws IOException {
      File file = new File("img/add.png");
        BufferedImage image = ImageIO.read(file);//читает и файла, это уже набор точек в RGB
        ImageIO.write(image, "jpeg", new File("img/add.jpeg"));

        //Получаем список поддерживаемых форматов
        String[] extensions = ImageIO.getReaderFileSuffixes();
        for(String str : extensions){
            System.out.println(str);
        }

        //Ридер в определённом формате
        ImageReader reader = null;
        Iterator<ImageReader> iterator = ImageIO.getImageReadersByFormatName("JPEG");
        if(iterator.hasNext()) reader = iterator.next();

        //Из файла получаем стрим данных
        InputStream inputStream = new FileInputStream(new File("img/add.png"));
        //получаем imageInputStream из inputStream (пиксели, а не биты и байты)
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
        //Второй способ получения imageInputStream из файла
        ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File("img/add.png"));
        //imageInputStream передаём в reader (которому задали формат JPEG выше)
        reader.setInput(imageInputStream, true);
        //Получаем наш image, с которым работаем дальше
        BufferedImage image1 = reader.read(reader.getNumImages(true));

        //В картинках могут быть маленькие картинки для предосмотра
        int count = reader.getNumThumbnails(0);
        BufferedImage image2 = reader.readThumbnail(0, count);
        System.out.println(reader.getHeight(0));
        reader.getWidth(0);

        //Райтер в определённом формате
        ImageWriter writer = null;
        Iterator<ImageWriter> iterator1 = ImageIO.getImageWritersByFormatName("JPEG");
        if(iterator1.hasNext()) iterator1.next();

        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("img/add.png"));
        writer.setOutput(imageOutputStream);
    }
}