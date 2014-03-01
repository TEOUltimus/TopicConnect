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
		for (Topic t : Platform.getPlatform().getTopics()) {
			if (t.textMatch(text)) {
				alertTopic(t, this);
			}
		}
	}

	private void alertTopic(Topic t, Message m) {
		t.alertPlatform(m);
	}

}
