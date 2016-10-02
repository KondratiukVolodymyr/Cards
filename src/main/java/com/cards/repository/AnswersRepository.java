package com.cards.repository;

import com.cards.model.AnswersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<AnswersEntity, Long> {
}
