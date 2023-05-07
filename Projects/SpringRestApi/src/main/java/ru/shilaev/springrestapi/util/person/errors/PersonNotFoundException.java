package ru.shilaev.springrestapi.util.person.errors;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(String message) {
        super(message);
    }
}
