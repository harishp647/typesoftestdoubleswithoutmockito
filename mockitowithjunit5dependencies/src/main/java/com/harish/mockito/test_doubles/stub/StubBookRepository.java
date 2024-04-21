package com.harish.mockito.test_doubles.stub;

import java.util.Collection;
import java.util.List;

public interface StubBookRepository {
    List<StubBook> findNewBooks(int days);

//    public void saveBook(StubBook stubBook);
//    public Collection<StubBook> findAllBooks();


}
