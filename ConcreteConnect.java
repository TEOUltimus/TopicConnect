/**
 * @author TEO Ultimus
 * Instance of the Connection interface
 */
public class ConcreteConnect implements Connect {
	private User privlegedUser;
	private User user1, user2;
	private boolean approved = false;
	private boolean requested1 = false, requested2 = false;
	
	public ConcreteConnect(User admin, User u1, User u2) {
		privlegedUser = admin;
		user1 = u1;
		user2 = u2;
	}
	
	public void alertUser(Topic t) {
		if (user1.getPreferences().contains(t) && user2.getPreferences().contains(t)) {
			user1.addPendingConnection(this);
			user2.addPendingConnection(this);
		}
	}

	public boolean requestPermission() {
		if (requested1 && requested2) {
			return privlegedUser.grantApproval(this);
		}
		return false;
	}

	public void connectUsers() {
		user1.removePendingConnection(this);
		user1.addConfirmedConnection(this);
		user2.removePendingConnection(this);
		user2.addConfirmedConnection(this);
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
