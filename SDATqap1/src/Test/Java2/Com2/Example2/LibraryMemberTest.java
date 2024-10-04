package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryMemberTest {
    private Library library;
    private LibraryMember member;

    @Before
    public void setUp() {
        library = new Library();
        member = new LibraryMember("Alice");
        library.addBook(new Book("1984", "George Orwell"));
    }

    @Test
    public void testBorrowAvailableBook() {
        member.borrowBook(library, "1984");
        assertFalse(library.findBook("1984").isAvailable());
    }

    @Test
    public void testBorrowUnavailableBook() {
        member.borrowBook(library, "1984");
        member.borrowBook(library, "1984"); // Try to borrow again
        assertFalse(library.findBook("1984").isAvailable()); // Should still be unavailable
    }
}
