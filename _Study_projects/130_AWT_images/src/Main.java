import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/*

 */

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("smile.jpg");
        BufferedImage image = ImageIO.read(file);

        WritableRaster raster = image.getRaster();
        for (int i = 0; i < raster.getWidth(); i++) {
            int[]pixel = raster.getPixel(i,0,new int[4]);
            pixel[0] = 0;
            pixel[1] = 0;
            pixel[2] = 0;
            raster.setPixel(i,0,pixel);
        }
        image.setData(raster);
        ImageIO.write(image, "png", new File("smile.png"));

        //Считываем и пишем обратно все пиксели
        raster.getPixels(0,0, image.getHeight(), image.getWidth(), new int[4 * image.getHeight() * image.getWidth()]);
        raster.setPixels(0,0, image.getHeight(), image.getWidth(), new int[4 * image.getHeight() * image.getWidth()]);

        //Способ чтения с помощью getDataElements
        Object data = raster.getDataElements(0,0,null);
        ColorModel colorModel = image.getColorModel();
        Color color = new Color(colorModel.getRGB(data), true);
        raster.setDataElements(0,0,data);

        image.setData(raster);
        ImageIO.write(image, "png", new File("smile.png"));
    }
}