package com.harish.mockito.test_doubles.Stub;

import com.harish.mockito.test_doubles.stub.StubBook;
import com.harish.mockito.test_doubles.stub.StubBookRepository;
import com.harish.mockito.test_doubles.stub.StubBookService;
import com.harish.mockito.test_dubles.fake.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StubTest {
    @Test
    public void testingStub()
    {
        StubBookRepository BookRepositoryStub = new BookRepositoryStub();
        StubBookService stubBookService = new StubBookService(BookRepositoryStub);

        //List<StubBookPractice> newBooks = stubBookRepositoryPractice.getBooks(days);

        List<StubBook> newBooksWithAppliedDiscount = stubBookService.getNewBooksWithAppliedDiscount(10,7);

        assertEquals(2, newBooksWithAppliedDiscount.size());
        assertEquals(450,newBooksWithAppliedDiscount.get(0).getPrice());
        assertEquals(360,newBooksWithAppliedDiscount.get(1).getPrice());
    }
}
