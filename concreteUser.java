import java.util.*;

public class ConcreteUser implements User {
    
	String name;
	String id;
	String location;
	boolean privelege;
	ArrayList<String> pendingConnections;
	ArrayList<String> confirmedConnections;
	ArrayList<Topic> preferredTopics;
	
	
    public ConcreteUser(String name)
    {
        this.name = name;
		
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
}
