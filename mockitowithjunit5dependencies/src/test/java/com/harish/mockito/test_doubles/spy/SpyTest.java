package com.harish.mockito.test_doubles.spy;

import com.harish.mockito.test_dubles.fake.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SpyTest {
    @Test
    public void testSpy()
    {
        SpyBook book1 = new SpyBook("647","mockito In Action",1729, LocalDate.now());
        SpyBook book2 = new SpyBook("777","JUNIT5 in Action",123,LocalDate.now());
        SpyBook book3 = new SpyBook("222","testing in Action",647,LocalDate.now());


        SpyBookRepositoryTest spyBookRepository = new SpyBookRepositoryTest();
        SpyBookService spyBookService = new SpyBookService(spyBookRepository);

        spyBookService.saveBooks(book1);
        spyBookService.saveBooks(book2);
        spyBookService.saveBooks(book3);

        assertEquals(1,spyBookService.findAllBooks());
        assertEquals(1,spyBookRepository.nooftimessaveCalled());
        assertFalse(spyBookRepository.calledWith(book3));

    }
}
