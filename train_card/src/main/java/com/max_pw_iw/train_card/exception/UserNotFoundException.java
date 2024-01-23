package com.max_pw_iw.train_card.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("The Person Object with id '" + id + "' does not exist in our records");
    }
}
