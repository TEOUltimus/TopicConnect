import java.util.*;

public class ConcreteUser implements User {
    
	String name;
	String id;
	String location;
	boolean localOnly;
	boolean privelege;
	ArrayList<String> pendingConnections;
	ArrayList<String> confirmedConnections;
	ArrayList<Topic> preferredTopics;
	
	
    public ConcreteUser(String name)
    {
        this.name = name;
		
    }
	
	public String getLocation()
	{
		 return this.location;
	}
	
	public boolean grantApproval(Connection pendingConnection)
	{
		if (this.privelege = false) {
			return false;
		}
		else {
			//Code creation of connection in each user in here
			return true;
		}
	}

	public void sendMessage(User recipient, String text) {
	}

	public void addPendingConnection(Connection conn) {
		
	}

	public void removePendingConnection(Connection conn) {
	}

	public void addConfirmedConnection(Connection conn) {
	}

	public Collection<Topic> getPreferences() {
		return null;
	}
}
