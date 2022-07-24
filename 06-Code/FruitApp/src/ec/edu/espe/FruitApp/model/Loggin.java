package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class Loggin {
    private String name;
    private int CellPhone;
    private String Email;

    public Loggin(String name, int CellPhone, String Email) {
        this.name = name;
        this.CellPhone = CellPhone;
        this.Email = Email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the CellPhone
     */
    public int getCellPhone() {
        return CellPhone;
    }

    /**
     * @param CellPhone the CellPhone to set
     */
    public void setCellPhone(int CellPhone) {
        this.CellPhone = CellPhone;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
