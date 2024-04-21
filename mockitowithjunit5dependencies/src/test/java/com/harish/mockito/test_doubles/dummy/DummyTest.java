package com.harish.mockito.test_doubles.dummy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DummyTest {
    @Test
    public void testDummy()
    {
        DummyBookRepository dummyBookRepositorydata = new TestDummyBookRepository();
        DummyEmailService dummyEmailService = new DummyEmailService();

         DummyBookService dummyBookser = new DummyBookService(dummyBookRepositorydata,dummyEmailService);

        DummyBook dummyBook1 = new DummyBook("647","mockito In Action",1729, LocalDate.now());
        DummyBook dummyBook2 = new DummyBook("777","JUNIT5 in Action",123,LocalDate.now());

        dummyBookser.saveBook(dummyBook1);
        dummyBookser.saveBook(dummyBook2);

        assertEquals(2,dummyBookser.findAllBooks());
    }
}
