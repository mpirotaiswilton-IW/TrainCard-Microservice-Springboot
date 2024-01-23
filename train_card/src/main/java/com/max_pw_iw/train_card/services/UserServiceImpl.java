package com.max_pw_iw.train_card.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.max_pw_iw.train_card.entity.User;
import com.max_pw_iw.train_card.exception.PersonNotFoundException;
import com.max_pw_iw.train_card.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service(value = "personService")
@AllArgsConstructor
public class PersonServiceImpl implements PersonService{

    private UserRepository personRepository;

    @Override
    public User getPerson(Long id) {
       Optional<User> person = personRepository.findById(id);
       return unwrapUser(person, id);
    }

    @Override
    public List<User> getPeople() {
        return (List<User>) personRepository.findAll();
    }

    static User unwrapUser(Optional<User> entity, Long id) {
    if (entity.isPresent()) return entity.get();
    else throw new PersonNotFoundException(id);
    }
    
}
