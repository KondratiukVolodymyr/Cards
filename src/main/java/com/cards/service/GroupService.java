package com.cards.service;

import com.cards.model.GroupEntity;

import java.util.List;

public interface GroupService {

    GroupEntity add(GroupEntity groupEntity);

    void delete(long id);

    GroupEntity edit(GroupEntity groupEntity);

    List<GroupEntity> getAll();

}
