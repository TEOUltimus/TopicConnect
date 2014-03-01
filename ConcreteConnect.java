/**
 * @author TEO Ultimus
 * Instance of the Connection interface
 */
public class ConcreteConnect implements Connect {
	private User privlegedUser;
	private User user1, user2;
	private boolean approved = false;
	private boolean requested1 = false, requested2 = false;
	
	/**
	 * Creates an instance of Connection
	 * @param admin
	 * @param u1 first user
	 * @param u2 second user
	 */
	public ConcreteConnect(User admin, User u1, User u2) {
		privlegedUser = admin;
		user1 = u1;
		user2 = u2;
	}
	
	/**
	 * Alerts the user that he has a new potential connection to check on topic t
	 */
	public void alertUser(Topic t) {
		if (user1.getPreferences().contains(t) && user2.getPreferences().contains(t)) {
			user1.addPendingConnection(this);
			user2.addPendingConnection(this);
		}
		if (requestPermission()) {
			connectUsers();
		} else {
			System.out.println("Either user does not have permission to approve this or not all users are interested.");
		}
	}

	/**
	 * Requests permission from the privleged user in charge
	 */
	private boolean requestPermission() {
		if (requested1 && requested2) {
			return privlegedUser.grantApproval(this);
		}
		return false;
	}

	/**
	 * Changes connection from potential to definite
	 */
	private void connectUsers() {
		user1.removePendingConnection(this);
		user1.addConfirmedConnection(this);
		user2.removePendingConnection(this);
		user2.addConfirmedConnection(this);
	}

	/**
	 * If a connection has been established, will give identity of other user
	 */
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

	public void markInterest(User u) {
		if (u == user1) {
			requested1 = true;
		} else if (u == user2) {
			requested2 = true;
		}
	}
}
