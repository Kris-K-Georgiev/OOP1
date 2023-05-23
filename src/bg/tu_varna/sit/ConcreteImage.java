package bg.tu_varna.sit;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConcreteImage extends Image {
    private List<Transformation> transformations;
    private BufferedImage image;

    public ConcreteImage(BufferedImage image) {
        this.image = image;
        this.transformations = new ArrayList<Transformation>();
    }

    @Override
    public void applyTransformation(Transformation transformation) {
        transformations.add(transformation);
        transformation.apply(this);
    }

    @Override
    public BufferedImage getImage() {
        return image;
    }

    @Override
    public void saveToFile(String filePath) throws IOException {
        ImageIO.write(image, "PNG", new File(filePath));
    }

    // Допълнителни методи...
}

