import java.util.Vector;

class Product{
    String name;
    double Price;
    String category;

    public Product(String name, double Price, String category){
        this.name=name;
        this.Price=Price;
        this.category=category;
    }
}
public class OnlineShoppingManager {
    private Vector<Product> inventory;
    public OnlineShoppingManager(){
        inventory= new Vector<>();
    }
    public void addProduct(String name, double Price, String category){
        Product prod=new Product(name,Price, category);
        inventory.add(prod);
    }

    public void removeProduct(String name){
        for (int i =0; i<inventory.size(); i++){
            if (inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                System.out.println("Removed: "+ name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }
    public void display(){
        if (inventory.isEmpty()){
            System.out.println("Inventory is empty.");
        }
        else{
            System.out.println("Inventory:");
            for (Product prod: inventory){
                System.out.println("Name: " + prod.name + ", Price: " + prod.Price + ", Category: " + prod.category);
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        OnlineShoppingManager o1= new OnlineShoppingManager();
        o1.addProduct("Laptop", 40000, "Electronics");
        o1.addProduct("T-shirt", 550, "Clothing");
        o1.addProduct("Book", 920, "Books");

        o1.display();
        o1.removeProduct("Book");
        o1.display();
    }
}
