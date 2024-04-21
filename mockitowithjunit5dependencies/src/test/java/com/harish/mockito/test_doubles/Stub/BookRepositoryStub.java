package com.harish.mockito.test_doubles.Stub;

import com.harish.mockito.test_doubles.stub.StubBook;
import com.harish.mockito.test_doubles.stub.StubBookRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements StubBookRepository {
    StubBook stubBook1 = new StubBook("647","mockito In Action",500, LocalDate.now());
    StubBook stubBook2 = new StubBook("777","JUNIT5 in Action",400,LocalDate.now());

    @Override
    public List<StubBook> findNewBooks(int days) {
        List<StubBook> listofbooks = new ArrayList<>();
        listofbooks.add(stubBook1);
        listofbooks.add(stubBook2);

        return listofbooks;
    }
}
