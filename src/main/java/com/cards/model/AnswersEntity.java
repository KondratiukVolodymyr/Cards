package com.cards.model;

import javax.persistence.*;

@Entity
@Table(name = "answers", schema = "cards")
public class AnswersEntity {
    private long id;
    private boolean isCorrect;
    private String answerDescription;
    private QuestionsEntity questionsEntity;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "is_correct")
    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Column(name = "answer_description")
    public String getAnswerDescription() {
        return answerDescription;
    }

    public void setAnswerDescription(String answerDescription) {
        this.answerDescription = answerDescription;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="question_id", unique = true, nullable = false)
    public QuestionsEntity getQuestionsEntity() {
        return questionsEntity;
    }

    public void setQuestionsEntity(QuestionsEntity questionsEntity) {
        this.questionsEntity = questionsEntity;
    }


}
