package ec.edu.espe.FruitApp.controller;

import ec.edu.espe.FruitApp.model.ConexionDB;
import com.mongodb.client.MongoCollection;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class ConexionMongoDBCustomer {
      
   
    public void ConexionCustomer(String email, String fullName, int cellPhone, String type, String offter){
        MongoCollection<Document> FruitCollection = new ConexionDB().conectionDb().
                 getCollection("CustomerCollection");
     Document data= new Document();  
      DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };  
        
        data.put("Email",email);
        data.put("Full Name",fullName);
        data.put("CellPhone:",+cellPhone);
        data.put("Type",type);
        data.put("Offter",offter);
        FruitCollection.insertOne(data);

    }
    
 
}
