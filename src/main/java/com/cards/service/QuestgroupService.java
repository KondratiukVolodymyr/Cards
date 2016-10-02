package com.cards.service;

import com.cards.model.QuestgroupEntity;

import java.util.List;

public interface QuestgroupService {

    QuestgroupEntity add(QuestgroupEntity questgroupEntity);

    void delete(long id);

    QuestgroupEntity edit(QuestgroupEntity questgroupEntity);

    List<QuestgroupEntity> getAll();

}
