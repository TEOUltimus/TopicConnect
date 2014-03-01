import java.util.*;

public class ConcreteUser implements User {
    
	String name;
	String id;
	String location;
	boolean localOnly;
	boolean privileged;
	HashSet<Connect> pendingConnections;
	HashSet<Connect> confirmedConnections;
	HashSet<Topic> preferredTopics;
	
	
    public ConcreteUser(String name) {
        this.name = name;
		id = "0";
		String location = "";
		localOnly = true;
		privileged = false;
		pendingConnections = new HashSet<Connect>();
		confirmedConnections = new HashSet<Connect>();
		preferredTopics = new HashSet<Topic>();
    }
	
	public String getName() {
		return this.name;
	}
	public String getLocation()	{
		 return this.location;
	}	

	public boolean grantApproval(Connect pendingConnection)	{
		return privileged;
	}

	public void sendMessage(User recipient, String text) {
		Message sentMessage = new ConcreteMessage(this, recipient, text);
		sentMessage.process();
		recipient.receiveMessage(sentMessage);
	}

	public void addPendingConnection(Connect conn) {
		pendingConnections.add(conn);
	}
	
	public boolean removePendingConnection(Connect conn) {
		return pendingConnections.remove(conn);
	}

	public void addConfirmedConnection(Connect conn) {
		confirmedConnections.add(conn);
	}
	
	public Collection<Topic> getPreferences() {
		return this.preferredTopics;
	}
	
	public void receiveMessage(Message m) {
		//Do Nothing
	}
	
	public void setLocalOnly(boolean bool) {
		this.localOnly = bool;
	}

	public boolean isPrivleged() {
		return privileged;
	}
	
	public void setPrivilege(boolean bool) {
		this.privileged = bool;
	}
}
