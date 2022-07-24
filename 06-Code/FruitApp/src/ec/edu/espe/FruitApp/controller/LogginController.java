package ec.edu.espe.FruitApp.controller;


import ec.edu.espe.FruitApp.model.Loggin;
import ec.edu.espe.FruitApp.view.FrmLoggin;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class LogginController {
    
    public boolean register(Loggin loggin, FrmLoggin aThis) {
        String message;
        message = loggin.getName()+"is going to be added to the database";
        JOptionPane.showMessageDialog(aThis, message);
        message ="Are you sure that you want to register"
                +loggin.getName()+"to the system";
        
        int reply = JOptionPane.showConfirmDialog(aThis, message);
        if (reply== JOptionPane.YES_OPTION){
            JOptionPane.showConfirmDialog(aThis,"Saving");
        }else{
            JOptionPane.showConfirmDialog(aThis,"it was not saved", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        //code to insert in the database
        return true;
    }

}
