import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dereste {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Window.MAX_WIDTH, Window.MAX_HEIGHT);
		frame.setVisible(true);
		
		MyPanel myPanel = new MyPanel();
		frame.getContentPane().add(myPanel);
		
//		myPanel.setBounds(0,0,300,300);
		myPanel.setFocusable(true);
		myPanel.addKeyListener(new Key());
		myPanel.game();
	}

}

class MyPanel extends JPanel {
	public void game(){
        Image img = createImage(Window.MAX_WIDTH, Window.MAX_HEIGHT);
        Graphics g = img.getGraphics();
        Graphics wg = getGraphics();
        
        Title title = new Title();
        PlayScene playScene = new PlayScene();
        Scene scene = Scene.Title;
        
        while(true){
            switch (scene){
                case Title:
                    if(title.isNewScene())
                        title.init();
                    title.draw(g);
                    scene = title.next();
                    break;
                case Play:
                    if(playScene.isNewScene())
                        playScene.init();
                    playScene.draw(g);
                    scene = playScene.next();
                    break;
                case Exit:
                    System.exit(0);
            }
            wg.drawImage(img, 0, 0, null);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
	}
}
