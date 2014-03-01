/**
 * @author TEO Ultimus
 * User of the platform
 */
public interface User {
	boolean grantApproval(Connection conn);
	void sendMessage(User recipient, String text);
}
