import java.util.*;

public class ConcreteUser implements User {
    
	String name;
	String id;
	String location;
	boolean localOnly;
	boolean privelege;
	HashSet<Connection> pendingConnections;
	HashSet<Connection> confirmedConnections;
	HashSet<Topic> preferredTopics;
	
	
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


	public void sendMessage(User recipient, String text) 
	{
		Message sentMessage = new Message(text);
		recipient.receiveMessage(sentMessage);
	}

	public void addPendingConnection(Connection conn) 
	{
		pendingConnections.add(conn);
	}

	public void removePendingConnection(Connection conn) 
	{
		pendingConnections.remove(conn);
	}

	public void addConfirmedConnection(Connection conn) 
	{
		confirmedConnections.add(conn);
	}
	
	Collection<Topic> getPreferences()
	{
		return this.preferredTopics;
	}
	
	public void receiveMessage(Message m)
	{
		//Do Nothing
	}
}
