package entities.enums;

import entities.orderItem;
import entities.client;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private client client;
    private List<orderItem> items = new ArrayList<>();
    public Order(){

    }
    public Order(Date moment, OrderStatus status, client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<orderItem> getItems() {
        return items;
    }
    public void addItem(orderItem item){
        items.add(item);
    }
    public void removeItem(orderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for (orderItem c : items) {
            sum += c.subTotal();
        }
        return sum;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sfd.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client.toString() + "\n");
        sb.append("Order items:\n");
        for (orderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
