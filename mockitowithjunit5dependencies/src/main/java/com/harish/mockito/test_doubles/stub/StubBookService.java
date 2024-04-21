package com.harish.mockito.test_doubles.stub;

import java.util.List;

public class StubBookService {

    private StubBookRepository stubBookRepository;

    public StubBookService(StubBookRepository stubBookRepository) {
        this.stubBookRepository = stubBookRepository;
    }

   public List<StubBook> getNewBooksWithAppliedDiscount(int discountRate,int days)
   {
      List<StubBook> newBooks = stubBookRepository.findNewBooks(days);
      //500 apply 10% -> 10% of 500 would be -> 50 -> 500-50 -> 450

       for(StubBook book:newBooks)
       {
          int Price =  (book.getPrice());
          int newPrice = Price - (discountRate*Price/100);
          book.setPrice(newPrice);
       }

       return newBooks;
   }
}
