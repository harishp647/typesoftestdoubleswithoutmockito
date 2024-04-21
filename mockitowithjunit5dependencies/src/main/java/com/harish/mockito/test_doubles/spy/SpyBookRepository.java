package com.harish.mockito.test_doubles.spy;

import javax.accessibility.AccessibleComponent;
import java.util.Collection;

public interface SpyBookRepository {
    public void saveBook(SpyBook book);
    public Collection<SpyBook> findAllBooks();
}
