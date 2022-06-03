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
        int op2,id,age,cellphone,amount,amountVegetable,amountRegister,idRegister;
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
        System.out.println("Ingrese una opcion");
      Scanner entrada=new Scanner(System.in);
      
      
        
         System.out.println("Opcion 1: Registrarse un nuevo cliente:");
         System.out.println("Opcion 2: Registrar a un trabajador:");
         System.out.println("Opcion 3: Registrar la venta de una fruta:");
         System.out.println("Opcion 4: Registrar la venta de una verduda:");
         System.out.println("Opcion 5: Registrar pagos: ");
         System.out.println("Opcion 6: Salir del menu");
         System.out.println("Elija opcion: ");
         op2=entrada.nextInt();
        switch(op2){
            case 1:
                
                System.out.println("Ingrese el id de la persona que desea registrar;");
                 id=entrada.nextInt();
                 System.out.println("Ingrese la edad de la persona que desea registrar:");
                 age=entrada.nextInt();
                  System.out.println("Integrese el nombre que desea registrar:");
                nombre=entrada.next();
                
               Client c2=new Client(nombre,id,age);
                System.out.println("Las datos que va a ingresar son estos:"+c2);
                
                break;
            case 2:
                System.out.println("Ingrese el id de la persona que desea registrar;");
                 id=entrada.nextInt();
                 System.out.println("Ingrese la edad de la persona que desea registrar:");
                 age=entrada.nextInt();
                  System.out.println("Integrese el nombre que desea registrar:");
                nombre=entrada.next();
                
                System.out.println("Integrese el email:");
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

