/**
 * @author TEO Ultimus
 * Message sent from one user to another
 */
public interface Message {
	void process();
	void alertTopic(Topic t, Message m);
}
