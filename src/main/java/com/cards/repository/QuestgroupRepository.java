package com.cards.repository;

import com.cards.model.QuestgroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestgroupRepository extends JpaRepository<QuestgroupEntity, Long> {

}
