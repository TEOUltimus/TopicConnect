/**
 * @author TEO Ultimus
 * Potential or actual connection between two users 
 */
public interface Connect {
	void alertUser(Topic t);
	boolean requestPermission();
	void connectUsers();
	User getOtherUser(User u);
}
