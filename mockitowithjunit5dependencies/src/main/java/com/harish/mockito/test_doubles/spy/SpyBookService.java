package com.harish.mockito.test_doubles.spy;

public class SpyBookService {
    private SpyBookRepository spyBookRepository;

    public SpyBookService(SpyBookRepository spyBookRepository) {
        this.spyBookRepository = spyBookRepository;
    }

    public void saveBooks(SpyBook book)
    {
        if(book.getPrice() > 400)
        {
            return;
        }
        spyBookRepository.saveBook(book);
    }

    public int findAllBooks()
    {
        int totalBooks = spyBookRepository.findAllBooks().size();
        return totalBooks;
    }
}
