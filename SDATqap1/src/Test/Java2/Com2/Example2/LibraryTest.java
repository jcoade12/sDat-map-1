package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Brave New World", "Aldous Huxley"));
    }

    @Test
    public void testFindAvailableBook() {
        Book book = library.findBook("1984");
        assertNotNull(book);
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void testFindUnavailableBook() {
        Book book = library.findBook("Brave New World");
        book.setAvailable(false);  // Make the book unavailable
        assertNull(library.findBook("Brave New World"));
    }
}
