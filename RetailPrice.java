// Class
public class RetailItem {
  private String description;
  private int unitsOnHand;
  private double price;

    //setters
    public RetailItem(String description) {
      this.description = description;
      this.unitsOnHand = 0;
      this.price = 0.00;
    }

    //getters
    public String getdescription() {
      return description;
    }
    public int getunitsOnHand() {
      return unitsOnHand;
    }
    public double getprice() {
      return price;
    }

    //Turn getters to string
    public String toString() {
      return
      "Description: " + this.getdescription() + "\n" +
      "Units on hand: " + this.getunitsOnHand() + "\n" +
      "Price: " + this.getprice() + "\n";
    }

    //mutators
    public void setdescription(String description) {
      this.description = description;
    }
    public void setunitsOnHand(int unitsOnHand) {
      this.unitsOnHand = unitsOnHand;
    }
    public void setprice(double price) {
      this.price = price;
    } 
}

// Main
class Main {
  public static void main(String[] args) {

    System.out.println("Item #1");
    RetailItem Item1 = new RetailItem("");
    Item1.setdescription("Jacket");
    Item1.setunitsOnHand(12);
    Item1.setprice(59.95);
    System.out.println(Item1);

    System.out.println("Item #2");
    RetailItem Item2 = new RetailItem("");
    Item2.setdescription("Designer Jeans");
    Item2.setunitsOnHand(40);
    Item2.setprice(34.95);
    System.out.println(Item2);

    System.out.println("Item #3");
    RetailItem Item3 = new RetailItem("");
    Item3.setdescription("Shirt");
    Item3.setunitsOnHand(20);
    Item3.setprice(24.95);
    System.out.println(Item3);
  }
}
