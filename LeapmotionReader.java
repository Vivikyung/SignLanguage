import java.awt.Frame;
import com.leapmotion.leap.*;

public class LeapmotionReader {
	private Frame frame;
	private Controller controller;
	private LeapEventListener listener;
	
	public LeapmotionReader() {
		controller = new Controller();
		controller.addListener(listener);
		
	}
	public void onConnect(Controller contr) {
		System.out.println("Connected");
	}
	public void onFrame(Controller controller) {
		Frame frame = controller.frame();
		
		System.out.println("Frame id: " + frame.id());
		System.out.println("Timestamp: " + frame.timestamp());
		System.out.println("Hands: " + frame.hands().count());
		System.out.println("Fingers: " + frame.fingers().count());
		System.out.println("Gestures: " + frame.gestures().count());
		
	}
	public void onDisconnect(Controller contr) {
		controller.removeListener(listener);
	}
}
