/**
 * @author TEO Ultimus
 * Instance of the Message interface
 */
public class ConcreteMessage implements Message{
	private String text;
	
	public ConcreteMessage(String t) {
		text = t;
	}
	
	public void process() {
		
	}

	public void alertTopic(Topic t, Message m) {
		
	}

}
