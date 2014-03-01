import java.util.Collection;

/**
 * @author TEO Ultimus
 * User of the platform
 */
public interface User {
	boolean grantApproval(Connect conn);
	boolean isPrivleged();
	void sendMessage(User recipient, String text);
	void receiveMessage(Message m);
	void expressInterest(Connect conn);
	void addPendingConnection(Connect conn);
	boolean removePendingConnection(Connect conn);
	void addConfirmedConnection(Connect conn);
	Collection<Topic> getPreferences();
}
