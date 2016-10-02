package com.cards.service;

import com.cards.model.QuestionsEntity;

import java.util.List;

public interface QuestionsService {

    QuestionsEntity add(QuestionsEntity questionsEntity);

    void delete(long id);

    QuestionsEntity edit(QuestionsEntity questionsEntity);

    List<QuestionsEntity> getAll();

}
