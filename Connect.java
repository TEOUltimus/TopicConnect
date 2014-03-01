/**
 * @author TEO Ultimus
 * Potential or actual connection between two users 
 */
public interface Connect {
	void alertUser(Topic t);
	User getOtherUser(User u);
	void markInterest(User u);
}
