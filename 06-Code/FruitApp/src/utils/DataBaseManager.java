package utils;

import org.bson.Document;


/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class DataBaseManager implements DataCustomer{

    @Override
    public boolean create(Document doc, String coll) {
        return false;
    }

    @Override
    public boolean update(String coll, String dataName, String data, Document doc) {
        return false;
    }

    @Override
    public boolean delete(String coll, String dataName, String value) {
        return false;
    }

    @Override
    public Document search(String coll, String field, String value) {
        return null;
    }


    
}
