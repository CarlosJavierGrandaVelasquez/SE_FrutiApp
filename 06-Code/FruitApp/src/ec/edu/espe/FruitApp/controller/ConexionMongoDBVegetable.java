
package ec.edu.espe.FruitApp.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.FruitApp.model.ConexionDB;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class ConexionMongoDBVegetable {
     public void ConexionVegetable(String name, String texture, int quantity, double weight, float cost){
        MongoCollection<Document> FruitCollection = new ConexionDB().conectionDb().
                 getCollection("VegetableCollection");
     Document data= new Document();  
      DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };  
        data.put("Name",name);
        data.put("Texure",texture);
        data.put("Quantity:",+quantity);
        data.put("Weight:",weight);
        data.put("Float",cost);
        FruitCollection.insertOne(data);
    }
}

