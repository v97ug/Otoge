import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class StartImage {
    private int x = 0;
    private int y = 0;
    private Image img;
    public StartImage() {
        try {
            img = ImageIO.read(new File("img/title.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getWidth(){
        return img.getWidth(null);
    }
    public int getHeight(){
        return img.getHeight(null);
    }
    public void draw(Graphics g){
        g.drawImage(img, x, y, null);
    }
}
