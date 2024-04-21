package com.harish.mockito.test_dubles.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository{
    //Fake test double, waht it does is -> instead of going to the actual database, it can create lighter form of database
    //Which is local to our testcases -> Instead of actual production dbs we can create
    //In memory databases, HashMap or List

    Map<String,Book> bookStore = new HashMap<>();
    // This bookStore will be acting as a lighter form of actual database

    @Override
    public void save(Book book) {
     bookStore.put(book.getBookId(),book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
