import java.util.*;

public class concreteUser implements User {
    
	String name;
	String id;
	String location;
	boolean localOnly;
	boolean privelege;
	ArrayList<String> pendingConnections;
	ArrayList<String> confirmedConnections;
	ArrayList<concreteTopic> preferredTopics;
	
	
    public concreteUser(String name)
    {
        this.name = name;
		
    }
	
	public String getLocation()
	{
		 return this.location;
	}
	
	public String 
	
	
	public boolean grantApproval(concreteConnection pendingConnection)
	{
		if this.privelege = false
		{
			return false;
		}
		else
			//Code creation of connection in each user in here
			return true;
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
	
	
	
	
}
