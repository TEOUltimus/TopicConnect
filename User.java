import java.util.Collection;

/**
 * @author TEO Ultimus
 * User of the platform
 */
public interface User {
	boolean grantApproval(Connect conn);
	void sendMessage(User recipient, String text);
	void receiveMessage(Message m);
	void addPendingConnection(Connect conn);
	void removePendingConnection(Connect conn);
	void addConfirmedConnection(Connect conn);
	Collection<Topic> getPreferences();
}
