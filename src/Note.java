import java.awt.Color;
import java.awt.Graphics;

public class Note extends Thread{
	private int x;
	private int y;
	
	public Note(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void move(){
		y+=5;
//		System.out.println(y); //y = 480
	}
	
	void draw(Graphics g){
		g.setColor(Color.green);
		g.drawOval(x, y, 100, 100);
	}
	
	boolean hit(){
		return y >= 470 && y <= 490 ;
	}
}
