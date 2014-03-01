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
	
<<<<<<< HEAD
	public String getLocation()
	{
		 return this.location;
	}
	
	public String 
	
	
	public boolean grantApproval(concreteConnection pendingConnection)
=======
	public boolean grantApproval(Connection pendingConnection)
>>>>>>> 33ed168321c0eb160aa8dec86ba35891aa5014c4
	{
		if (this.privelege = false) {
			return false;
		}
		else {
			//Code creation of connection in each user in here
			return true;
		}
	}
	
<<<<<<< HEAD
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
	
	
	
	
=======
	public void addConnection(Connection newConnection)	{
	}
	
	public void removeConnection(Connection connection)	{
	}

	public void sendMessage(User recipient, String text) {
	}

	@Override
	public void addPendingConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePendingConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConfirmedConnection() {
		// TODO Auto-generated method stub
		
	}
>>>>>>> 33ed168321c0eb160aa8dec86ba35891aa5014c4
}
