package ec.edu.espe.FruitApp.view;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.FruitApp.model.Client;

import ec.edu.espe.FruitApp.model.Fruit;
import ec.edu.espe.FruitApp.model.Register;
import ec.edu.espe.FruitApp.model.Vegetable;
import ec.edu.espe.FruitApp.model.Worker;
import java.io.BufferedReader;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 *@author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class FruitApp {
     

    public static void main(String[] args){
      
      int opcion2,id,age,cellphone,amount,amountVegetable,amountRegister,
               idRegister;
      double weight,cost,weightVegetable,costVegetable;
      String name,email,color,colorVegetable,nameVegetable,
               nameRegister,codeRegister,nameFruit;
       
       File fileC = new File("./NewClient.csv");
       File fileW = new File("./Worker.csv");
       File fileF = new File("./Fruit.csv");
       File fileV = new File("./Vegetable.csv");
       File fileP = new File("./Payments.csv");
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
               System.out.println("Enter the age of the person you "
                        + "want to register:");
               ge=entrada.nextInt();
               System.out.println("Enter the name you want to register:");
               name=entrada.next();
               Client c2=new Client(name,id,age);
               System.out.println("The data to be entered is:"+c2);
               try (FileWriter fileWc = new FileWriter(fileC,true);
                        FileWriter fileWp = new FileWriter(fileC,true);){
                        fileWc.write(c2.toString()+"\n");
                    }
                catch(Exception e){
                system.out.println("An error has occurred");
                    }
                  break;
                    
            case 2:
                System.out.println("Enter the id of "
                        + "the person you want to register:");
                id=entrada.nextInt();
                System.out.println("Enter the age of the "
                        + "person you want to register:");
                age=entrada.nextInt();
                System.out.println("Enter the name you want to register:");
                name=entrada.next();
                System.out.println("Enter the email:");
                email=entrada.next();
                System.out.println("Enter the cellphone "
                        + "of the person you want to register:");
                cellphone=entrada.nextInt();
                Worker W1=new Worker(name,id,age,cellphone,email);
                System.out.println("The data to be entered is:"+W1);
               try (FileWriter fileWc = new FileWriter(fileW,true);
                        FileWriter fileWp = new FileWriter(fileW,true);){
                        fileWc.write(W1.toString()+"\n");
                    }
                   catch(Exception e){
                    System.out.println("An error has occurred");
                    }
                  break;
                 
                 
            case 3:
                System.out.println("Enter fruit name");
                nameFruit=entrada.next();
                System.out.println("Enter the color of the fruit");
                color=entrada.next();
                System.out.println("Enter the amount to sell");
                amount=entrada.nextInt();
                System.out.println("Enter the weight of the fruit");
                weight=entrada.nextDouble();
                System.out.println("Enter the cost of the fruit:");
                cost=entrada.nextDouble();
                Fruit F1=new Fruit(nameFruit,color,amount,weight,cost);
                System.out.println("The data to be entered is:"+F1);
                try (FileWriter fileWc = new FileWriter(fileF,true);
                            FileWriter fileWp = new FileWriter(fileF,true);){
                        fileWc.write(F1.toString()+"\n");
                    }
                   catch(Exception e){
                   System.out.println("An error has occurred");
                    }
                break;
            case 4:
                System.out.println("Enter name of vegetable:");
                nameVegetable=entrada.next();
                System.out.println("Enter the color of the vegetable:");
                colorVegetable=entrada.next();
                System.out.println("Enter the amount to sell:");
                amountVegetable=entrada.nextInt();
                System.out.println("Enter the weight of the vegetable:");
                weightVegetable=entrada.nextDouble();
                System.out.println("Enter the cost of the vegetable:");
                costVegetable=entrada.nextDouble();
                Vegetable V1=new Vegetable(nameVegetable,
                        colorVegetable,amountVegetable,
                        weightVegetable,costVegetable);
                System.out.println("The data of the vegetables that are"
                        + " going to enter:"+V1);
                try (FileWriter fileWc = new FileWriter(fileV,true);
                        FileWriter fileWp = new FileWriter(fileV,true);){
                        fileWc.write(V1.toString()+"\n");
                    }
                   catch(Exception e){
                   system.out.println("An error has occurred");
                    }
                break;
            case 5: 
              System.out.println("Enter the frist last name of the worker to be paid:");
              nameRegister=entrada.next();
              System.out.println("Enter worker code:");
              codeRegister=entrada.next();
              System.out.println("Enter the amount to pay:");
              amountRegister=entrada.nextInt();
              System.out.println("Enter the id:");
              idRegister=entrada.nextInt();
              Register R1=new Register(nameRegister,codeRegister,
                       amountRegister,idRegister);
               System.out.println("The people who will pay are:"+R1);
               try (FileWriter fileWc = new FileWriter(fileP,true);
                       FileWriter fileWp = new FileWriter(fileP,true);){
                       fileWc.write(R1.toString()+"\n");
                    }
                   catch(Exception e){
                    System.out.println("An error has occurred");
                    }
                break;
            case 6:
                break;
            default : 
                System.out.println("The option does not exist");
                   break;

                   
         }
        
    }
}

