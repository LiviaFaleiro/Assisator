package com.quotes.demo.Model;

public class Quote {
    private String author;
    private String text;
    private String book;
    

    public String getBook() {
        return book;
    }

    public Quote(String author, String text, String book) {
        this.author = author;
        this.text = text;
        this.book = book;
    
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}

