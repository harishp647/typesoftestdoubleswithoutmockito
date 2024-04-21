package com.harish.mockito.test_doubles.StubPractice;


import java.util.List;

public class StubBookServicePractice {

    private StubBookRepositoryPractice stubBookRepositoryPractice;

    public StubBookServicePractice(StubBookRepositoryPractice stubBookRepositoryPractice) {
        this.stubBookRepositoryPractice = stubBookRepositoryPractice;
    }

    public List<StubBookPractice> getNewBooksWithAppliedDiscount(int discountRate, int days){

        List<StubBookPractice> newBooks = stubBookRepositoryPractice.getBooks(days);

        for(StubBookPractice book:newBooks)
        {
            int price = book.getPrice();
            int discountedPrice = (price-(discountRate*price)/100);
            book.setPrice(discountedPrice);
        }
        return newBooks;
    }
}
