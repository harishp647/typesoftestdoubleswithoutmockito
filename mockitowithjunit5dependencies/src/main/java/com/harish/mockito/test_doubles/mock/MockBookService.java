package com.harish.mockito.test_doubles.mock;

public class MockBookService {

    private MockBookRepository mockBookRepository;

    public MockBookService(MockBookRepository mockBookRepository) {
        this.mockBookRepository = mockBookRepository;
    }

    public void addBook(MockBook mockBook)
    {
        if(mockBook.getPrice() < 400)
        {
            return;
        }
        mockBookRepository.saveBook(mockBook);
    }

    public int findNumberofBooks()
    {
       int totalbooks =  mockBookRepository.totalNumberofBooks().size();
       return totalbooks;
    }
}
