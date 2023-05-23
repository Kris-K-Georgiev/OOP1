package bg.tu_varna.sit;

import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Image {
    public abstract void applyTransformation(Transformation transformation);

    public abstract BufferedImage getImage();

    public abstract void saveToFile(String filePath) throws IOException;
}
