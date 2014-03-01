import java.util.Collection;

/**
 * @author TEO Ultimus
 * User of the platform
 */
public interface User {
	boolean grantApproval(Connection conn);
	void sendMessage(User recipient, String text);
	void receiveMessage(Message m);
	void addPendingConnection(Connection conn);
	void removePendingConnection(Connection conn);
	void addConfirmedConnection(Connection conn);
	Collection<Topic> getPreferences();
}
