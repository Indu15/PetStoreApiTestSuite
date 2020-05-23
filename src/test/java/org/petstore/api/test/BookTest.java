package org.petstore.api.test;

public class BookTest {
    public static void main(String args[]){
        Book b = new Book();
        b.setauthor("TestAuthor");
        b.setcolor("Brown");
        b.setname("Test Book");
        b.setpages(100);
        System.out.println(b.getauthor());
        System.out.println(b.getcolor());
        System.out.println(b.getname());
        System.out.println(b.getpages());
    }
}
