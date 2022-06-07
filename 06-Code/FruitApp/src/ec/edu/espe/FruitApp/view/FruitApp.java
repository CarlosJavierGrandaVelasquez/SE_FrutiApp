package ec.edu.espe.FruitApp.view;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.FruitApp.model.Client;
import ec.edu.espe.FruitApp.model.ConexionDB;
import ec.edu.espe.FruitApp.model.Fruit;
import ec.edu.espe.FruitApp.model.Register;
import ec.edu.espe.FruitApp.model.Vegetable;
import ec.edu.espe.FruitApp.model.Worker;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
/**
 *
 *@author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class FruitApp {
     DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };

     public static void main(String[] args){
         MongoCollection<Document> FruitCollection = new ConexionDB().GetDB().
                 getCollection("FruitCollection");
       Document data= new Document();
        int opcion2,id,age,cellphone,amount,amountVegetable,amountRegister,
                idRegister;
        double weight,cost,weightVegetable,costVegetable;
        String name,email,color,colorVegetable,nameVegetable,
                nameRegister,codeRegister,nameFruit;
       
       
        
        
        Client c1=new Client();
       System.out.println("WELCOME TO THE 'DON MORALES' FRUIT STORE SYSTEM ");
       System.out.println("Enter an option");
      Scanner entrada=new Scanner(System.in);
      
      
        
         System.out.println("Option 1: Register a new client:");
         System.out.println("Option 2: Register a worker:");
         System.out.println("Option 3: Register the sale of a fruit:");
         System.out.println("Option 4: Record the sale of a vegetable:");
         System.out.println("Option 5: Register payments:");
         System.out.println("Option 6: Exit the menu");
         System.out.println("Choose option: ");
         opcion2=entrada.nextInt();
        switch(opcion2){
            case 1:
                
                System.out.println("Enter the id of the "
                        + "person you want to register:");
                id=entrada.nextInt();
                data.put("Id:",+id);
                System.out.println("Enter the age of the person you "
                        + "want to register:");
                age=entrada.nextInt();
                data.put("Age:",+age);
                System.out.println("Enter the name you want to register:");
                name=entrada.next();
                data.put("Name",name);
                Client c2=new Client(name,id,age);
                FruitCollection.insertOne(data);
                break;
                
            case 2:
                System.out.println("Enter the id of "
                        + "the person you want to register:");
                id=entrada.nextInt();
                data.put("Id:",+id);
                System.out.println("Enter the age of the "
                        + "person you want to register:");
                age=entrada.nextInt();
                data.put("Age",+age);
                System.out.println("Enter the name you want to register:");
                name=entrada.next();
                data.put("Name",name);
                System.out.println("Enter the email:");
                email=entrada.next();
                data.put("E-mail:",email);
                System.out.println("Enter the cellphone "
                        + "of the person you want to register:");
                cellphone=entrada.nextInt();
                data.put("Cellphone",+cellphone);
                FruitCollection.insertOne(data);
                 break; 
                 
            case 3:
                System.out.println("Enter fruit name");
                nameFruit=entrada.next();
                data.put("Name Fruit: ", nameFruit);
                System.out.println("Enter the color of the fruit");
                color=entrada.next();
                data.put("Color;", color);
                System.out.println("Enter the amount to sell");
                amount=entrada.nextInt();
                data.put("Amount:",+amount);
                System.out.println("Enter the weight of the fruit");
                weight=entrada.nextDouble();
                data.put("Weight", weight);
                System.out.println("Enter the cost of the fruit:");
                cost=entrada.nextDouble();
                data.put("Cost",+cost);
                Fruit F1=new Fruit(nameFruit,color,amount,weight,cost);
                System.out.println("The data to be entered is:"+F1);
                FruitCollection.insertOne(data);
                break;
            case 4:
                System.out.println("Enter name of vegetable:");
                nameVegetable=entrada.next();
                data.put("Name of Vegetable",nameVegetable);
                System.out.println("Enter the color of the vegetable:");
                colorVegetable=entrada.next();
                data.put("Color of the Vegetable:",colorVegetable);
                System.out.println("Enter the amount to sell:");
                amountVegetable=entrada.nextInt();
                data.put("Amount",+amountVegetable);
                System.out.println("Enter the weight of the vegetable:");
                weightVegetable=entrada.nextDouble();
                data.put("Weigh :",+weightVegetable);
                System.out.println("Enter the cost of the vegetable:");
                costVegetable=entrada.nextDouble();
                data.put("Costo; ",+costVegetable);
                Vegetable V1=new Vegetable(nameVegetable,
                        colorVegetable,amountVegetable,
                        weightVegetable,costVegetable);
                System.out.println("The data of the vegetables that are"
                        + " going to enter:"+V1);
                FruitCollection.insertOne(data);
                break;
            case 5: 
                System.out.println("Enter the name of the worker to be paid:");
                nameRegister=entrada.next();
                data.put("Name :",nameRegister);
                System.out.println("Enter worker code:");
                codeRegister=entrada.next();
                data.put("Code ",codeRegister);
                System.out.println("Enter the amount to pay:");
                amountRegister=entrada.nextInt();
                data.put("Amount: ",amountRegister);
                System.out.println("Enter the id:");
                idRegister=entrada.nextInt();
                data.put("Id:",+idRegister);
                Register R1=new Register(nameRegister,codeRegister,
                         amountRegister,idRegister);
                System.out.println("The people who will pay are:"+R1);
                FruitCollection.insertOne(data);
                break;
            case 6:
                break;
            default : 
                   System.out.println("The option does not exist");
                   break;

                   
         }
        
    }
}

