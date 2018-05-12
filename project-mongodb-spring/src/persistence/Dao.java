package persistence;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Dao {

	public MongoClient client;
	public MongoClient getClient() throws Exception{
		client = new MongoClient();
		return client;
		
	}
	
	public MongoDatabase getDB()throws Exception{
		return getClient().getDatabase("dbnoite");
	}
	
	public void close() throws Exception{
		client.close();
		
	}
	
	
	
	
}
