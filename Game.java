import java.util.ArrayList;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

import java.io.*;
import javax.sound.sampled.*;


public class Game extends JFrame implements ActionListener {
	public static ArrayList<Letter> alphabet;
	public LeapmotionReader read;
	
	public Game() {
		/*alphabet = new ArrayList<Letter>();
		
		alphabet.add(new Letter("A"));
		alphabet.add(new Letter("B"));
		alphabet.add(new Letter("C"));
		alphabet.add(new Letter("D"));
		alphabet.add(new Letter("E"));
		alphabet.add(new Letter("F"));
		alphabet.add(new Letter("G"));
		alphabet.add(new Letter("H"));
		alphabet.add(new Letter("I"));
		alphabet.add(new Letter("J"));
		alphabet.add(new Letter("K"));
		alphabet.add(new Letter("L"));
		alphabet.add(new Letter("M"));
		alphabet.add(new Letter("N"));
		alphabet.add(new Letter("O"));
		alphabet.add(new Letter("P"));
		alphabet.add(new Letter("Q"));
		alphabet.add(new Letter("R"));
		alphabet.add(new Letter("S"));
		alphabet.add(new Letter("T"));
		alphabet.add(new Letter("U"));
		alphabet.add(new Letter("V"));
		alphabet.add(new Letter("W"));
		alphabet.add(new Letter("X"));
		alphabet.add(new Letter("Y"));
		alphabet.add(new Letter("Z"));*/
	}
	
	public void play() {
		showStartScreen();
	}
	public void showStartScreen() {
		
	}
	public void showLetterScreen(Letter let) {
	}
}
