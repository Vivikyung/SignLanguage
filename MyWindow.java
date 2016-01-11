import java.awt.*;

import javax.imageio.*;

import java.awt.Event;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.*;


public class MyWindow {
	public  MyWindow(String s) {
		JFrame frame = new JFrame("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//stuff goes here
		BufferedImage pic = ImageIO.read(new File("C:/Users/Ken/Downloads/qr.png"));
		frame.getContentPane().add(BorderLayout.CENTER, pic);

		
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}
