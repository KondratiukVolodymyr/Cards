package com.cards.service.impl;


import com.cards.model.UsersEntity;
import com.cards.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cards.repository.UsersRepository;


import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Transactional
    public UsersEntity add(UsersEntity usersEntity) {
        return usersRepository.saveAndFlush(usersEntity);
    }

    public void delete(long id) {
        usersRepository.delete(id);
    }

    public UsersEntity edit(UsersEntity usersEntity) {
        return usersRepository.saveAndFlush(usersEntity);
    }

    public List<UsersEntity> getAll() {
        return usersRepository.findAll();
    }
}
