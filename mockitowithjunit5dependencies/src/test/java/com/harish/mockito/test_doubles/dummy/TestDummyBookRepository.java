package com.harish.mockito.test_doubles.dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestDummyBookRepository implements DummyBookRepository{
    Map<String,DummyBook> bookStore = new HashMap<>();

    @Override
    public void save(DummyBook dummyBook) {
        bookStore.put(dummyBook.getBookId(),dummyBook);
    }

    @Override
    public Collection<DummyBook> findAllBooks() {
        return bookStore.values();
    }

    @Override
    public String EmailMessage() {
        return "Hi Chiiti - This message is from Email  Data";
    }
}
