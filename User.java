/**
 * @author TEO Ultimus
 * User of the platform
 */
public interface User {
	boolean grantApproval(Connection conn);
	void sendMessage(User recipient, String text);
	void addPendingConnection(Connection conn);
	void removePendingConnection(Connection conn);
	void addConfirmedConnection(Connection conn);
}
