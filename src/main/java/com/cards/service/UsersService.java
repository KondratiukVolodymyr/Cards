package com.cards.service;

import com.cards.model.UsersEntity;

import java.util.List;

public interface UsersService {

    UsersEntity add(UsersEntity usersEntity);

    void delete(long id);

    UsersEntity edit(UsersEntity usersEntity);

    List<UsersEntity> getAll();

}
