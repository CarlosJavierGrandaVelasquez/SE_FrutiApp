package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class Fruit {
   private String name;
   private String color;
   private int amount;
   private double weight;
   private double cost;

   public Fruit() {
    }

   public Fruit(String name, String color, int amount, double weight, double cost) {
       this.name = name;
       this.color = color;
       this.amount = amount;
       this.weight = weight;
       this.cost = cost;
    }
    
    @Override
   public String toString() {
       return "Fruit{" + "name=" + name + ", color=" + color + ", amount=" + amount + ", weight=" + weight + ", cost=" + cost + '}';
    }
    
   public String getName() {
       return name;
    }

   public void setName(String name) {
       this.name = name;
    }

   public String getColor() {
       return color;
    }

   public void setColor(String color) {
       this.color = color;
    }

   public int getAmount() {
        return amount;
    }

   public void setAmount(int amount) {
        this.amount = amount;
    }

   public double getWeight() {
        return weight;
    }

   public void setWeight(double weight) {
        this.weight = weight;
    }

   public double getCost() {
        return cost;
    }

   public void setCost(float cost) {
        this.cost = cost;
    }
    
}
