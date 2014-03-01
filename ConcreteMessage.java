/**
 * @author TEO Ultimus
 * Instance of the Message interface
 */
public class ConcreteMessage implements Message{
	private String text;
	private User sender, recipient;
	
	public ConcreteMessage(User s, User r, String t) {
		text = t;
		sender = s;
		recipient = r;
	}
	
	/**
	 * Processes the text to look for matching topics
	 */
	public void process() {
		for (Topic t : Platform.getPlatform().getTopics()) {
			System.out.println(t.toString());
			if (t.textMatch(text)) {
				System.out.println("\tMatch!");
				alertTopic(t, this);
			}
		}
	}

	public void alertTopic(Topic t, Message m) {
		t.alertPlatform(m);
	}

	public User getSender() {
		return sender;
	}

	public User getRecipient() {
		return recipient;
	}

}
