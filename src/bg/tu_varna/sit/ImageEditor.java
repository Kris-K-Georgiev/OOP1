package bg.tu_varna.sit;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEditor {
    private Image currentImage;

    public void openImage(String filePath) {
        try {
            BufferedImage image = ImageIO.read(new File(filePath));
            currentImage = new ConcreteImage(image);
            System.out.println("Successfully opened file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error opening file: " + filePath);
        }
    }

    public void closeImage() {
        currentImage = null;
        System.out.println("Image closed.");
    }

    public void saveImage() {
        if (currentImage != null) {
            try {
                currentImage.saveToFile("output.png");
                System.out.println("Image saved to output.png");
            } catch (IOException e) {
                System.out.println("Error saving image.");
            }
        } else {
            System.out.println("No image is currently open.");
        }
    }

    public void applyGrayscaleTransformation() {
        if (currentImage != null) {
            Transformation transformation = new GrayscaleTransformation();
            currentImage.applyTransformation(transformation);
            System.out.println("Grayscale transformation applied.");
        } else {
            System.out.println("No image is currently open.");
        }
    }

    // Допълнителни методи...
}

