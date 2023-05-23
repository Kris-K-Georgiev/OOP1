package bg.tu_varna.sit;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GrayscaleTransformation implements Transformation {
    private Image image;

    @Override
    public void apply(Image image) {
        BufferedImage originalImage = image.getImage();
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        BufferedImage grayscaleImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        Graphics graphics = grayscaleImage.getGraphics();
        graphics.drawImage(originalImage, 0, 0, null);
        graphics.dispose();

        this.image = new ConcreteImage(grayscaleImage);
    }

    // Допълнителни методи...
}

