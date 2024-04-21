package com.harish.mockito.test_dubles.fake;

public class BookService {

    private BookRepository bookRepository;
    //We will be creating bookRepository to get hold of this using constructor for initiliazing the book service class



    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public int findNumberOfBooks()
    {
        return bookRepository.findAll().size();
    }
}
