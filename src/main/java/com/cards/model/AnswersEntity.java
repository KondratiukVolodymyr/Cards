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
    @Column(name = "Id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "IsCorrect")
    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Column(name = "AnswerDescription")
    public String getAnswerDescription() {
        return answerDescription;
    }

    public void setAnswerDescription(String answerDescription) {
        this.answerDescription = answerDescription;
    }

    @OneToOne(optional = false)
    @JoinColumn(name="Question_id", unique = true, nullable = false)
    public QuestionsEntity getQuestionsEntity() {
        return questionsEntity;
    }

    public void setQuestionsEntity(QuestionsEntity questionsEntity) {
        this.questionsEntity = questionsEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswersEntity that = (AnswersEntity) o;

        if (isCorrect != that.isCorrect) return false;
        if (answerDescription != null ? !answerDescription.equals(that.answerDescription) : that.answerDescription != null)
            return false;
        return questionsEntity != null ? questionsEntity.equals(that.questionsEntity) : that.questionsEntity == null;

    }

    @Override
    public int hashCode() {
        int result = (isCorrect ? 1 : 0);
        result = 31 * result + (answerDescription != null ? answerDescription.hashCode() : 0);
        result = 31 * result + (questionsEntity != null ? questionsEntity.hashCode() : 0);
        return result;
    }
}
