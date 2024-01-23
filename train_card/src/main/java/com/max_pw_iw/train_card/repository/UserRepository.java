package com.max_pw_iw.train_card.repository;

import org.springframework.data.repository.CrudRepository;

import com.max_pw_iw.train_card.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
}
