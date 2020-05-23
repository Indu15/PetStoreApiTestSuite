package org.petstore.api.test;

public class Book {

    private int pages;
    private String color;
    private String name;
    private String author;
    public Book(){}
    public void setpages(int pages) {
        this.pages = pages;
    }
    public int getpages() {
        return pages;
    }
    public void setcolor(String color ) {
        this.color = color;
    }
    public String getcolor() {
        return color;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setauthor(String author) {
        this.author = author;
    }
    public String getauthor() {
        return author;

    }
}

