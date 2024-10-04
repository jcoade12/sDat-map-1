package com.example;

import java.util.List;

public class LibraryManager {
    private Library library;

    public LibraryManager() {
        library = new Library();
    }

    public void addBookToLibrary(String title, String author) {
        Book book = new Book(title, author);
        library.addBook(book);
    }

    public List<Book> listAvailableBooks() {
        return library.getBooks();
    }

    public void registerMember(String name) {
        LibraryMember member = new LibraryMember(name);
        library.registerMember(member);
    }

    public void displayMembers() {
        for (LibraryMember member : library.getMembers()) {
            System.out.println("Member: " + member.getName());
        }
    }
}
