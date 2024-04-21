package com.harish.mockito.test_doubles.mock;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mockTest {
    @Test
    public void mockTesting()
    {
        TestmockBookRepository testmockBookRepository = new TestmockBookRepository();
        MockBookService mockBookService = new MockBookService(testmockBookRepository);

        MockBook mockBook1 = new MockBook("647","mockito In Action",1729, LocalDate.now());
        MockBook mockBook2 = new MockBook("777","JUNIT5 in Action",123,LocalDate.now());
        MockBook mockBook3 = new MockBook("222","testing in Action",647,LocalDate.now());

        mockBookService.addBook(mockBook1); //saveBook1
        mockBookService.addBook(mockBook2); //saveBook2
        mockBookService.addBook(mockBook3); //return

        testmockBookRepository.verify(mockBook3,2);
    }
}
