package com.mirea;

public class Address {
    private String city;
    private String street;
    private int building;
    private char bldPart;
    private int apartment;
    private String ZIP;

    public Address(String city, String street, int building, char bldPart, int apartment, String ZIP) {
        setCity(city);
        setStreet(street);
        setBuilding(building);
        setBldPart(bldPart);
        setApartment(apartment);
        setZIP(ZIP);
    }

    public void setCity(String city) { this.city = city; }
    public String getCity() { return city; }

    public void setStreet(String street) { this.street = street; }
    public String getStreet() { return street; }

    public void setBuilding(int building) { this.building = building; }
    public int getBuilding() { return building; }

    public void setBldPart(char bldPart) { this.bldPart = bldPart; }
    public char getBldPart() { return bldPart; }

    public void setApartment(int apartment) { this.apartment = apartment; }
    public int getApartment() { return apartment; }

    public void setZIP(String ZIP) { this.ZIP = ZIP; }
    public String getZIP() { return ZIP; }
}
