package com.jaytech.errorhandlingbestpractice.web.exception;

public class BookNotFoundException extends RuntimeException {
    private long id;

    public BookNotFoundException(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
