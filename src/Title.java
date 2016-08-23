import java.awt.Color;
import java.awt.Graphics;

public class Title extends ClassScene{
    private StartImage image;
    @Override
    public void init() {
        super.init();
        image = new StartImage();
    }
    @Override
    void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, Window.MAX_WIDTH, Window.MAX_HEIGHT);
        image.draw(g);
    }
    @Override
    Scene next() { //次のシーンにいくときの処理
//        if(image.clicked()) {
////            System.out.println("Clicked");
//            newScene = true;
//            return Scene.Get;
//        }
    	
    	if(Key.enter){
    		newScene = true;
    		return Scene.Play;
    	}
        return Scene.Title;
    }
}
