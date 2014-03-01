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
		System.out.println(privileged);
		return privileged;
	}

	public void sendMessage(User recipient, String text) {
		System.out.println("Sent '" + text + "' to " + recipient);
		Message sentMessage = new ConcreteMessage(this, recipient, text);
		sentMessage.process();
		recipient.receiveMessage(sentMessage);
	}

	public void addPendingConnection(Connect conn) {
		System.out.println("Pending Connection");
		pendingConnections.add(conn);
		expressInterest(conn);
	}
	
	public boolean removePendingConnection(Connect conn) {
		return pendingConnections.remove(conn);
	}

	public void addConfirmedConnection(Connect conn) {
		System.out.println("Connection Received!");
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
	
	public void addPreference(Topic preferredTopic)
	{
		this.preferredTopics.add(preferredTopic);
	}
	
	public void addPreferences(Collection<Topic> preferredTopicsN)
	{
		this.preferredTopics.addAll(preferredTopicsN);
	}

	public void expressInterest(Connect conn) {
		conn.markInterest(this);
	}
	
}

