package com.example;

public class LibraryMember {
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Library library, String bookTitle) {
        Book book = library.findBook(bookTitle);
        if (book != null && library.isBookAvailable(book)) {
            System.out.println(name + " borrowed " + bookTitle);
        } else {
            System.out.println(bookTitle + " is not available.");
        }
    }
}
