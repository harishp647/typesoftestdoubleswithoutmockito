package com.harish.mockito.test_doubles.mock;

import java.time.LocalDate;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestmockBookRepository implements MockBookRepository{

    int saveCalled = 0;
    MockBook lastSavedBook = null;

    @Override
    public void saveBook(MockBook book) {
        saveCalled++;
        lastSavedBook = book;
    }

    @Override
    public Collection<MockBook> totalNumberofBooks() {
        return null;
    }

//    public int numberoftimescalled()
//    {
//        return saveCalled;
//    }
//
//    public boolean verifylastsavedBook(MockBook book)
//    {
//        return lastSavedBook.equals(book);
//    }

    public void verify(MockBook mockBook, int times){

        assertEquals(times,saveCalled);
        assertEquals(mockBook,lastSavedBook);
    }
}
