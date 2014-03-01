/**
 * @author TEO Ultimus
 * Instance of the Message interface
 */
public class ConcreteMessage implements Message{
	private String text;
	private User sender, recipient;
	
	public ConcreteMessage(User s, User r, String t) {
		text = t;
	}
	
	public void process() {
		// MAGIC
	}

	public void alertTopic(Topic t, Message m) {
		t.alertPlatform(m);
	}

	public User getSender() {
		return null;
	}

	public User getRecipient() {
		return null;
	}

}
