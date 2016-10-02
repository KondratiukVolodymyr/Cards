package com.cards.service.impl;

import com.cards.model.GroupEntity;
import com.cards.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cards.repository.GroupRepository;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public GroupEntity add(GroupEntity groupEntity) {
        return groupRepository.saveAndFlush(groupEntity);
    }

    public void delete(long id) {
        groupRepository.delete(id);
    }

    public GroupEntity edit(GroupEntity groupEntity) {
        return groupRepository.saveAndFlush(groupEntity);
    }

    public List<GroupEntity> getAll() {
        return groupRepository.findAll();
    }
}
