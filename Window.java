import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;


public class Window extends JFrame {
	public Window() {
		int width=800;
		int height=600;
		
		add(new Game());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sign language learner!");
		setResizable(false);
		setVisible(true);
	}
}
