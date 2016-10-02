package com.cards.service.impl;

import com.cards.model.QuestionsEntity;
import com.cards.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cards.repository.QuestionsRepository;


import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    public QuestionsEntity add(QuestionsEntity questionsEntity) {
        return questionsRepository.saveAndFlush(questionsEntity);
    }

    public void delete(long id) {
        questionsRepository.delete(id);
    }

    public QuestionsEntity edit(QuestionsEntity questionsEntity) {
        return questionsRepository.saveAndFlush(questionsEntity);
    }

    public List<QuestionsEntity> getAll() {
        return questionsRepository.findAll();
    }
}
