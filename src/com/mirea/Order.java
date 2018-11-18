package com.mirea;

import java.util.Date;
import java.util.ArrayList;

public class Order {
    private Date orderDate;
    private Customer customer;
    private ArrayList<Book> goods;
    private double cost;
    private Address deliveryAddress;
    private Date deliveryDate;
    private char status;

    public Order(Date orderDate, Customer customer, ArrayList<Book> goods, double cost, Address deliveryAddress,
                 Date deliveryDate, char status) {
        setOrderDate(orderDate);
        setCustomer(customer);
        setGoods(goods);
        setCost(cost);
        setDeliveryAddress(deliveryAddress);
        setDeliveryDate(deliveryDate);
        setStatus(status);
    }

    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public Date getOrderDate() { return orderDate; }

    public void setCustomer(Customer customer) { this.customer = customer; }
    public Customer getCustomer() { return customer; }

    public void setGoods(ArrayList<Book> goods) { this.goods = goods; }
    public ArrayList<Book> getGoods() { return goods; }

    public void setCost(double cost) { this.cost = cost; }
    public double getCost() { return cost; }

    public void setDeliveryAddress(Address deliveryAddress) { this.deliveryAddress = deliveryAddress; }
    public Address getDeliveryAddress() { return deliveryAddress; }

    public void setDeliveryDate(Date deliveryDate) { this.deliveryDate = deliveryDate; }
    public Date getDeliveryDate() { return deliveryDate; }

    public void setStatus(char status) { this.status = status; }
    public char getStatus() { return status; }
}
