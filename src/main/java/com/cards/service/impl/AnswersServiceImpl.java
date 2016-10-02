package com.cards.service.impl;


import com.cards.model.AnswersEntity;
import com.cards.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cards.repository.AnswersRepository;

import java.util.List;

@Service
public class AnswersServiceImpl implements AnswersService {

    @Autowired
    private AnswersRepository answersRepository;

    public AnswersEntity add(AnswersEntity answersEntity) {
        return answersRepository.saveAndFlush(answersEntity);
    }

    public void delete(long id) {
        answersRepository.delete(id);
    }

    public AnswersEntity edit(AnswersEntity answersEntity) {
        return answersRepository.saveAndFlush(answersEntity);
    }

    public List<AnswersEntity> getAll() {
        return answersRepository.findAll();
    }
}
