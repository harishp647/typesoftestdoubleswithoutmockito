package com.harish.mockito.test_doubles.dummy;

public class DummyEmailService implements EmailService{
    @Override
    public String sendEmail(String message) {
     throw new AssertionError("Metgod is not implemented");
    }
}
