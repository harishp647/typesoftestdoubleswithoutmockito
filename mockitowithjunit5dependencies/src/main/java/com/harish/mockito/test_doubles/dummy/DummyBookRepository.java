package com.harish.mockito.test_doubles.dummy;

import java.util.Collection;

public interface DummyBookRepository {
    public void save( DummyBook dummyBook);
    public Collection<DummyBook> findAllBooks();

    String EmailMessage();
}
