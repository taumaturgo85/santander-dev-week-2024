package com.taumaturgo.domain.service;

import com.taumaturgo.domain.model.User;

public interface UserService {

    User finfById(Long id);

    User create(User userToCreate);
}
