package com.mirea;

import java.util.ArrayList;

public class Customer {
    private int ID;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String email;
    private Address address;
    private String phoneNumber;
    private ArrayList<Order> orders;

    public Customer(int ID, String firstName, String lastName, String patronymic,
                    String email, Address address, String phoneNumber, ArrayList<Order> orders) {
        setID(ID);
        setFirstName(firstName);
        setLastName(lastName);
        setPatronymic(patronymic);
        setEmail(email);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setOrders(orders);
    }

    public void setID(int ID) { this.ID = ID; }
    public int getID() { return ID; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }
    public String getPatronymic() { return patronymic; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setAddress(Address address) { this.address = address; }
    public Address getAddress() { return address; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setOrders(ArrayList<Order> orders) { this.orders = orders; }
    public ArrayList<Order> getOrders() { return orders; }
}
