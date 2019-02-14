package learn.selenium.webdriver.methods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class ResdMongoRough {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		getSelectiveDocument();
	}

	public static void getSelectiveDocument() throws FileNotFoundException {

		// Search Parameters
		String field_name = "VendorProviderID", srch_string = "27efee9f-8cc4-48e9-9bb3-c15bcf610fd9";

		MongoClientURI uri = new MongoClientURI(
				"mongodb://shaikh.mohammad.rafi:cOXoh%2F6itIUgag==@grpsuatmdb1.caqhgrps.local:27017,grpsuatmdb2.caqhgrps.local:27017,grpsuatmdb3.caqhgrps.local:27017/?replicaSet=lmdbrpset");
		MongoClient client = new MongoClient(uri);

		MongoDatabase database = client.getDatabase("grpsdevmdb1");
		MongoCollection<Document> collection = database.getCollection("Providers");
		FindIterable<Document> iterDoc = collection.find(Filters.eq(field_name, srch_string));
		MongoCursor<Document> cursor = iterDoc.iterator();
		
		try {
			int i = 1;
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
				i++;
			}
			System.out.println();
			System.out.println("Total Documents  "+i);
			
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
			
		} finally {
			cursor.close();
		}

	}

}
