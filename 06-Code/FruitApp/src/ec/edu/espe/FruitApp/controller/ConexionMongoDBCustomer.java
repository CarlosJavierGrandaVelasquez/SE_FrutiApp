
package ec.edu.espe.FruitApp.controller;

import ec.edu.espe.FruitApp.model.ConexionDB;
import com.mongodb.client.MongoCollection;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;


/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class ConexionMongoDBCustomer {
      
   
    public void ConexionCustomer(String email, String fullName, int cellPhone, String type, String offter, String totalSale){
        MongoCollection<org.bson.Document> FruitCollection = new ConexionDB().GetDB().
                 getCollection("FruitCollection");
     Document data= new Document() {
            @Override
            public int getLength() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void addDocumentListener(DocumentListener listener) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void removeDocumentListener(DocumentListener listener) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void addUndoableEditListener(UndoableEditListener listener) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void removeUndoableEditListener(UndoableEditListener listener) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object getProperty(Object key) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void putProperty(Object key, Object value) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void remove(int offs, int len) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getText(int offset, int length) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void getText(int offset, int length, Segment txt) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Position getStartPosition() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Position getEndPosition() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Position createPosition(int offs) throws BadLocationException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Element[] getRootElements() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Element getDefaultRootElement() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void render(Runnable r) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };  
      DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };  
        
//        data.put("Customer","");
//        data.put("Id",email);
//        data.put("Full Name",fullName);
//        data.put("Email:",+cellPhone);
//        data.put("Type",type);
//        data.put("Float",offter);
//        data.put("Total Sale",totalSale);
//        FruitCollection.insertOne(data);

    }
    
    
    
    
    
 
}
