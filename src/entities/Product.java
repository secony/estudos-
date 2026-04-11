package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInEstoque(){
        return price * quantity;
    }
    public void addProdutcts(int quantity){
        this.quantity += quantity;
    }
    public void  subProdutcts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Product Name: " + name + ", Price: R$" + price + ", Quantity: " + quantity + ", Total: R$" + totalValueInEstoque();
    }
}
