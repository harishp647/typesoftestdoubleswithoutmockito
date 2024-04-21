package com.harish.mockito.test_doubles.spy;

import com.harish.mockito.test_dubles.fake.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SpyBookRepositoryTest implements SpyBookRepository{

    Map<String, SpyBook> hmap = new HashMap<>();

    int saveCalled = 0;
    SpyBook lastAddedBook = null;

    @Override
    public void saveBook(SpyBook book) {
        hmap.put(book.getBookId(),book);
        saveCalled++;
        lastAddedBook = book;
    }

    @Override
    public Collection<SpyBook> findAllBooks() {
        return hmap.values();
    }

    public int nooftimessaveCalled()
    {
        return saveCalled;
    }

    public boolean calledWith(SpyBook book)
    {
        return lastAddedBook.equals(book);
    }
}
