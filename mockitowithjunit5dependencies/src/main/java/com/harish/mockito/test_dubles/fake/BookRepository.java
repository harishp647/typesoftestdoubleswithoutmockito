package com.harish.mockito.test_dubles.fake;

import java.util.Collection;

public interface BookRepository {
    public void save(Book book);
    public Collection<Book> findAll();
}
