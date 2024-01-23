package com.max_pw_iw.train_card.services;

import java.util.List;

import com.max_pw_iw.train_card.entity.User;

public interface UserService {
    User getPerson(Long id);
    List<User> getPeople();
    
}
