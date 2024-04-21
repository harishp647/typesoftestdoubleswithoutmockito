package com.harish.mockito.test_dubles.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FakeTest {

    @Test
    public void testFake()
    {
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book("647","mockito In Action",1729,LocalDate.now());
        Book book2 = new Book("777","JUNIT5 in Action",123,LocalDate.now());

         bookService.addBook(book1);
         bookService.addBook(book2);

         assertEquals(2,bookService.findNumberOfBooks());

    }
}
