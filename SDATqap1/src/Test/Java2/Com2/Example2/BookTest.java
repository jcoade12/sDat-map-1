package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testBookCreation() {
        Book book = new Book("1984", "George Orwell");
        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertTrue(book.isAvailable());
    }
    
    @Test
    public void testSetAvailable() {
        Book book = new Book("1984", "George Orwell");
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }
}
