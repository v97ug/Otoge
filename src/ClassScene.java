import java.awt.Graphics;

abstract class ClassScene {
	   protected boolean newScene = true; //新しく作られたシーンかどうか
	    public void init(){
	        newScene = false;
	    }
	    public boolean isNewScene() {
	        return newScene;
	    }
	    abstract void draw(Graphics g);
	    abstract Scene next(); //次のシーンにいくときの処理
}
