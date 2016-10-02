package com.cards.service;

import com.cards.model.AnswersEntity;

import java.util.List;

public interface AnswersService {

    AnswersEntity add(AnswersEntity answersEntity);

    void delete(long id);

    AnswersEntity edit(AnswersEntity answersEntity);

    List<AnswersEntity> getAll();

}
