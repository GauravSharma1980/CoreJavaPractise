package com;

class Book {
    private String name;
    private String author;
    
    Book() {}
    
    Book(String name, String author) {
        name = name;
        author = author;
    }
    
    String getName() {
        return name;
    }
    
    String getAuthor() {
        return author;
    }
}
 
public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", "Kathy Sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}