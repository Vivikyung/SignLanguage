import com.leapmotion.leap.*;

public class LeapmotionReader {
	private Frame frame;
	private Controller controller;
	private LeapEventListener listener;
	
	public LeapmotionReader() {
		controller = new Controller();
		frame = new Frame();
		controller.addListener(listener);
	}
	public Frame getFrame() {
		return frame;
	}
}
