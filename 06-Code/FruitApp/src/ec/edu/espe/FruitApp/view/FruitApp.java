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
     MongoCollection<Document> FruitCollection=new ConexionDB().ObtenerDB().getCollection("FruitCollection");
     DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
         }
         
     };
    
    public static void main(String[] args){
       Document data= new Document();
        int opcion2,id,age,cellphone,amount,amountVegetable,amountRegister,idRegister;
        double weight,cost,weightVegetable,costVegetable;
        String nombre="";
        String email="";
        String nombreFruta="";
        String color="";
        String colorVegetable="";
        String nombreVegetable="";
        String nombreRegister="";
        String codeRegister="";
        
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
                
                System.out.println("Enter the id of the person you want to register:");
                 id=entrada.nextInt();
                 data.put("Name:",+id);
                 FruitCollection.insertOne(id);
                 
                 System.out.println("Enter the age of the person you want to register:");
                 age=entrada.nextInt();
                  System.out.println("Enter the name you want to register:");
                nombre=entrada.next();
                
               Client c2=new Client(nombre,id,age);
                System.out.println("The data to be entered is these:"+c2);
                
                break;
            case 2:
                System.out.println("Enter the id of the person you want to register:");
                 id=entrada.nextInt();
                 System.out.println("Enter the age of the person you want to register:");
                 age=entrada.nextInt();
                  System.out.println("Enter the name you want to register:");
                nombre=entrada.next();
                
                System.out.println("Enter the email:");
                    email=entrada.next();
                System.out.println("Enter the age of the person you want to register:");
                 cellphone=entrada.nextInt();
               Worker w2=new Worker(nombre,id,age,cellphone,email);
                System.out.println("The data to be entered is:"+w2);
                 break; 
            case 3:
                System.out.println("Enter fruit name");
                 nombreFruta=entrada.next();
                 System.out.println("Enter the color of the fruit");
                 color=entrada.next();
                  System.out.println("Enter the amount to sell");
                amount=entrada.nextInt();
                System.out.println("Enter the weight of the fruit");
                weight=entrada.nextDouble();
                System.out.println("Enter the cost of the fruit:");
                 cost=entrada.nextDouble();
                 Fruit F1=new Fruit(nombreFruta,color,amount,weight,cost);
                System.out.println("The data to be entered is:"+F1);
                break;
            case 4:
                System.out.println("Enter name of vegetable:");
                 nombreVegetable=entrada.next();
                 System.out.println("Enter the color of the vegetable:");
                 colorVegetable=entrada.next();
                  System.out.println("Enter the amount to sell:");
                amountVegetable=entrada.nextInt();
                System.out.println("Enter the weight of the vegetable:");
                weightVegetable=entrada.nextDouble();
                System.out.println("Enter the cost of the vegetable:");
                 costVegetable=entrada.nextDouble();
                Vegetable V1=new Vegetable(nombreVegetable,colorVegetable,amountVegetable,weightVegetable,costVegetable);
                System.out.println("The data of the vegetables that are going to enter:"+V1);
                break;
            case 5: 
                System.out.println("Enter the name of the worker to be paid:");
                 nombreRegister=entrada.next();
                 
                 System.out.println("Enter worker code:");
                 codeRegister=entrada.next();
                 System.out.println("Enter the amount to pay:");
                 amountRegister=entrada.nextInt();
                 System.out.println("Enter the id:");
                 idRegister=entrada.nextInt();
                 Register R1=new Register(nombreRegister,codeRegister,amountRegister,idRegister);
                 System.out.println("The people who will pay are:"+R1);
               
                 

                break;
            case 6:
                break;
            default : 
                   System.out.println("The option does not exist");
                   break;

                   
         }
        
    }
}

