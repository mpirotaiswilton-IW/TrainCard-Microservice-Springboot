package com.max_pw_iw.train_card.exception;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(Long id){
        super("The Person Object with id '" + id + "' does not exist in our records");
    }
}
