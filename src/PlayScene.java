import sun.applet.AppletListener;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlayScene extends ClassScene implements ActionListener{
	private Note note;
	private Timer timer;
	private double bpm = 191;
	private ArrayList<Note> arrayList = new ArrayList<Note>();
	private Note[] notes = new Note[100];
//	private Clip music;
//	SoundPlayer sp = new SoundPlayer("sound/07 - ハイファイ☆デイズ (Game Version).wav");
	SoundPlayer sp = new SoundPlayer("sound/ho00101.wav");

	@Override
	public void init() {
		super.init();
		note = new Note(550, 0);
		timer = new Timer((int) (60/bpm * 1000), this);
		timer.start();
		for (int i=0; i < 100; i++){
			notes[i] = new Note(550, 0);
		}
		sp.play();
	}
	
	@Override
	void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, Window.MAX_WIDTH, Window.MAX_HEIGHT);
		
		g.setColor(Color.red);
		g.drawOval(550,480,100,100);

//		for(Note note : arrayList){
//			note.move();
//			note.draw(g);
//		}
		note.move();
		note.draw(g);

		for (int i=0; i < n; i++){
			if(n >= 100) {
				n = 0;
				break;
			}
			notes[i].move();
			notes[i].draw(g);
		}
		if(note.hit() && Key.enter){
			System.out.println("ok");
		}
	}

	@Override
	Scene next() {
//		timer.stop();
		return Scene.Play;
	}

	int n = 0;
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
//		note.move();
//		arrayList.add(new Note(550,0));
		n++;
		System.out.println("action");
//		note.draw(g);
	}
}
