import java.util.*;

public class concreteUser implements User {
    
	String name;
	String id;
	String location;
	boolean privelege;
	ArrayList<String> pendingConnections;
	ArrayList<String> confirmedConnections;
	ArrayList<concreteTopic> preferredTopics;
	
	
    public concreteUser(String name)
    {
        this.name = name;
		
    }
	
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
	
	public sendMessage(concreteMessage newMessage, concreteUser otherUser)
	{
	
	
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
