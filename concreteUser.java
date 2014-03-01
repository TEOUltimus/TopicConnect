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
		id = "0";
		String location = "";
		localOnly = true;
		privelge = false;
		pendingConnections = new ArrayList<String>();
		confirmedConnections = new ArrayList<String>();
		preferredTopics = new ArrayList<Topic>();
		
    }
	
	public String getName()
	{
		return this.name;
	}
	public String getLocation()
	{
		 return this.location;
	}	
	public String 
	
	
	public boolean grantApproval(concreteConnection pendingConnection)
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
	
	public void sendMessage(concreteMessage newMessage, concreteUser otherUser)
	{
		return null;
	
	}
	
	public void addConnection(concerteConnection newConnection)
	{
	
		return null;
	}
	
	public void removeConnection(concreteConnection connection)
	{
		return null;
	}
	
	public void addConnection(Connection newConnection)	{
	}
	
	public void removeConnection(Connection connection)	{
	}

	public void sendMessage(User recipient, String text) {
	}

	@Override
	public void addPendingConnection() {
		
	}

	@Override
	public void removePendingConnection() {
		
	}

	@Override
	public void addConfirmedConnection() {
		
	}
}
