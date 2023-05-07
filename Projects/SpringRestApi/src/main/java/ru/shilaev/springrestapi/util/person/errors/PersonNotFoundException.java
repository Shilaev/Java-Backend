package ru.shilaev.springrestapi.util.person.errors;

import java.util.function.Supplier;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(String message) {
        super(message);
    }
}
