package com.mirea;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> authors;
    private String genre;
    private String publisher;
    private int publishYear;
    private int pageCount;
    private char coverType;
    private double price;
    private int countOnStock;
    private boolean isOnStock;

    public Book(String title, ArrayList<String> authors, String genre, String publisher, int publishYear,
                int pageCount, char coverType, double price, int countOnStock, boolean isOnStock) {
        setTitle(title);
        setAuthors(authors);
        setGenre(genre);
        setPublisher(publisher);
        setPublishYear(publishYear);
        setPageCount(pageCount);
        setCoverType(coverType);
        setPrice(price);
        setCountOnStock(countOnStock);
        setOnStock(isOnStock);
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setAuthors(ArrayList<String> authors) { this.authors = authors; }
    public ArrayList<String> getAuthors() { return authors; }

    public void setGenre(String genre) { this.genre = genre; }
    public String getGenre() { return genre; }

    public void setPublisher(String publisher) { this.publisher = publisher; }
    public String getPublisher() { return publisher; }

    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }
    public int getPublishYear() { return publishYear; }

    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public int getPageCount() { return pageCount; }

    public void setCoverType(char coverType) { this.coverType = coverType; }
    public char getCoverType() { return coverType; }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    public void setCountOnStock(int countOnStock) { this.countOnStock = countOnStock; }
    public int getCountOnStock() { return countOnStock; }

    public void setOnStock(boolean onStock) { isOnStock = onStock; }
    public boolean getOnStock() { return isOnStock; }
}
