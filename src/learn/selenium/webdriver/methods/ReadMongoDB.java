package learn.selenium.webdriver.methods;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ReadMongoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fetchmongodb1();
	}

	public static void fetchmongodb1() {

		/*
		 * connect to mongodb using new MongoClient(“localhost”,27017); connect to
		 * database using client.getDatabase(“employee_db”); Get collection using
		 * database.getCollection(“employees”);
		 * 
		 */

		// MongoClientURI uri = new
		// MongoClientURI("mongodb://user1:pwd1@host1/?authSource=db1");

		MongoClientURI uri = new MongoClientURI(
				// mongodb://myDBReader:D1fficultP%40ssw0rd@mongodb0.example.com:27017,mongodb1.example.com:27017,mongodb2.example.com:27017/admin?replicaSet=myRepl
				"mongodb://shaikh.mohammad.rafi:cOXoh%2F6itIUgag==@grpsuatmdb1.caqhgrps.local:27017,grpsuatmdb2.caqhgrps.local:27017,grpsuatmdb3.caqhgrps.local:27017/?replicaSet=lmdbrpset");
		MongoClient client = new MongoClient(uri); // with default server and port adress
		MongoDatabase database = client.getDatabase("grpsdevmdb1");

		MongoCollection<Document> collection = database.getCollection("Providers");
//CTRL+SHIFT+/ - COMMENT		
/*		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		// Getting the iterator
		Iterator it = iterDoc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
*/
		//Listing the available collections in mongoDB
		for (String name : database.listCollectionNames()) { 
	         System.out.println(name); 
	      } 
	}

}
