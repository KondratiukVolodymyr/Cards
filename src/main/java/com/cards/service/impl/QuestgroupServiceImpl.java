package com.cards.service.impl;


import com.cards.model.QuestgroupEntity;
import com.cards.service.QuestgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cards.repository.QuestgroupRepository;



import java.util.List;

@Service
public class QuestgroupServiceImpl implements QuestgroupService {

    @Autowired
    private QuestgroupRepository questgroupRepository;

    public QuestgroupEntity add(QuestgroupEntity questgroupEntity) {
        return questgroupRepository.saveAndFlush(questgroupEntity);
    }

    public void delete(long id) {
        questgroupRepository.delete(id);
    }

    public QuestgroupEntity edit(QuestgroupEntity questgroupEntity) {
        return questgroupRepository.saveAndFlush(questgroupEntity);
    }

    public List<QuestgroupEntity> getAll() {
        return questgroupRepository.findAll();
    }
}
