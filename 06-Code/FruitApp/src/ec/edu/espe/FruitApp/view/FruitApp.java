package ec.edu.espe.FruitApp.view;
import ec.edu.espe.FruitApp.model.Client;
import ec.edu.espe.FruitApp.model.Fruit;
import ec.edu.espe.FruitApp.model.Register;
import ec.edu.espe.FruitApp.model.Vegetable;
import ec.edu.espe.FruitApp.model.Worker;
import java.util.Scanner;
/**
 *
 *@author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class FruitApp {
    
    
    public static void main(String[] args){
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
         op2=entrada.nextInt();
        switch(opcion2){
            case 1:
                
                System.out.println("Enter the id of the person you want to register:");
                 id=entrada.nextInt();
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
                System.out.println("Ingrese la edad de la persona que desea registrar:");
                 cellphone=entrada.nextInt();
               Worker w2=new Worker(nombre,id,age,cellphone,email);
                System.out.println("Las datos que va a ingresar son estos:"+w2);
                 break; 
            case 3:
                System.out.println("Ingrese nombre de la fruta");
                 nombreFruta=entrada.next();
                 System.out.println("Ingrese el color de la fruta");
                 color=entrada.next();
                  System.out.println("Integrese la cantidad a vender");
                amount=entrada.nextInt();
                System.out.println("Integrese el peso de la fruta");
                weight=entrada.nextDouble();
                System.out.println("Ingrese el costo de la fruta:");
                 cost=entrada.nextDouble();
                 Fruit F1=new Fruit(nombreFruta,color,amount,weight,cost);
                System.out.println("Las datos que va a ingresar son estos:"+F1);
                break;
            case 4:
                System.out.println("Ingrese nombre de la  verdura");
                 nombreVegetable=entrada.next();
                 System.out.println("Ingrese el color de la verdura");
                 colorVegetable=entrada.next();
                  System.out.println("Integrese la cantidad a vender");
                amountVegetable=entrada.nextInt();
                System.out.println("Integrese el peso de la verdura");
                weightVegetable=entrada.nextDouble();
                System.out.println("Ingrese el costo de la verdura:");
                 costVegetable=entrada.nextDouble();
                Vegetable V1=new Vegetable(nombreVegetable,colorVegetable,amountVegetable,weightVegetable,costVegetable);
                System.out.println("Las datos de la verduras que van a ingresar:"+V1);
                break;
            case 5: 
                System.out.println("Ingrese nombre de la persona trabajador a ser pagado:");
                 nombreRegister=entrada.next();
                 
                 System.out.println("Ingrese codigo del trabajador:");
                 codeRegister=entrada.next();
                 System.out.println("Ingrese el monto a pagar:");
                 amountRegister=entrada.nextInt();
                 System.out.println("Ingrese el id:");
                 idRegister=entrada.nextInt();
                 Register R1=new Register(nombreRegister,codeRegister,amountRegister,idRegister);
                 System.out.println("Las personas que va a pagar son: "+R1);
               
                 

                break;
            case 6:
                break;
            default : 
                   System.out.println("La opcion no existe");
                   break;

                   
         }
        
    }
}

