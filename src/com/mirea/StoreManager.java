package com.mirea;

import java.util.HashMap;
import java.util.ArrayList;

public class StoreManager {
    private HashMap<Integer, Book> books;
    private HashMap<Integer, Customer> customers;
    private HashMap<Integer, Order> orders;

    public StoreManager() {
        books = new HashMap<>();
        customers = new HashMap<>();
        orders = new HashMap<>();
    }

    public StoreManager (HashMap<Integer, Book> books, HashMap<Integer, Customer> customers, HashMap<Integer, Order> orders) {
        setBooks(books);
        setCustomers(customers);
        setOrders(orders);
    }

    public void setBooks(HashMap<Integer, Book> books) { this.books = books; }
    public HashMap<Integer, Book> getBooks() { return books; }

    public void setCustomers(HashMap<Integer, Customer> customers) { this.customers = customers; }
    public HashMap<Integer, Customer> getCustomers() { return customers; }

    public void setOrders(HashMap<Integer, Order> orders) { this.orders = orders; }
    public HashMap<Integer, Order> getOrders() { return orders; }

    public void addCustomer(Customer customer) {
        if (!customers.containsKey(customer.getID()))
            customers.put(customer.getID(), customer);
    }

    public Customer getCustomer(int customerID) { return customers.get(customerID); }

    public void editCustomer (int customerID, ArrayList<String> fields, ArrayList<String> params) {

    }
}
