/**
 * @author TEO Ultimus
 * Instance of the Connection interface
 */
public class ConcreteConnection implements Connection{
	private User privelegedUser;
	private User user1, user2;
	private boolean approved = false;
	private int numRequests = 0;
	
	public ConcreteConnection(User admin, User u1, User u2) {
		privelegedUser = admin;
		user1 = u1;
		user2 = u2;
	}
	
	public void alertUser(Topic t) {
		
	}

	public boolean requestPermission() {
		return false;
	}

	public void connectUsers(Connection conn) {
		
	}

	public User getOtherUser(User u) {
		if (!approved) return null;
		if (u == user1) {
			return user2;
		} else if (u == user2) {
			return user1;
		} else {
			return null;
		}
	}

}
