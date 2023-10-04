package entities;
import entities.Product;
public class orderItem {

    private Integer quantity;
    private Double price;
    private Product product;
    public orderItem(){

    }
    public orderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal(){
        return quantity*price;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName() + ", $");
        sb.append(String.format("%.2f",price) + ", Quantity: ");
        sb.append(quantity + ", Subtotal: $"+ String.format("%.2f", subTotal()));
        return sb.toString();
    }
}
