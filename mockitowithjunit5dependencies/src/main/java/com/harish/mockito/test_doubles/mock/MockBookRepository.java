package com.harish.mockito.test_doubles.mock;

import java.util.Collection;

public interface MockBookRepository {
    public void saveBook(MockBook book);

    public Collection<MockBook> totalNumberofBooks();
}
