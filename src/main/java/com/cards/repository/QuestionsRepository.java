package com.cards.repository;

import com.cards.model.QuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Long> {

}
