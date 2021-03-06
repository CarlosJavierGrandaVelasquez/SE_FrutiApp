
package ec.edu.espe.FruitApp.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.FruitApp.model.ConexionDB;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class ConexionMongoDBWorker {
   public void ConexionWorker(String name, String code,  int id){
        MongoCollection<Document> FruitCollection = new ConexionDB().conectionDb().
                 getCollection("WorkerCollection");
     Document data= new Document();  
      DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };  
        data.put("Name",name);
        data.put("Code:",code);
        data.put("Id:",id);
        FruitCollection.insertOne(data);
    } 
   
}
