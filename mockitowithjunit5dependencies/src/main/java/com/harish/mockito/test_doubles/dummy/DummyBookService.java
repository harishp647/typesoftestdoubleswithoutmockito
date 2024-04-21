package com.harish.mockito.test_doubles.dummy;

public class DummyBookService {
    private DummyBookRepository dummyBookRepository;
    private EmailService emailService;

    public DummyBookService(DummyBookRepository dummyBookRepository, EmailService emailService) {
        this.dummyBookRepository = dummyBookRepository;
        this.emailService = emailService;
    }

    public void saveBook(DummyBook dummyBook)
    {
        dummyBookRepository.save(dummyBook);
    }

    public int findAllBooks()
    {
        return dummyBookRepository.findAllBooks().size();
    }

    public String EmailNotification()
    {
        return emailService.sendEmail("Hi How are you");
    }
}
