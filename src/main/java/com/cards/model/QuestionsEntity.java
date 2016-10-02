package com.cards.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "questions", schema = "cards")
public class QuestionsEntity {
    private long id;
    private String questionDescription;
    private Set<QuestgroupEntity> questgroupEntitySet;

    @Id
    @GeneratedValue
    @Column(name = "Id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "QuestionDescription")
    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "questionsEntitySet")
    public Set<QuestgroupEntity> getQuestgroupEntitySet() {
        return questgroupEntitySet;
    }

    public void setQuestgroupEntitySet(Set<QuestgroupEntity> questgroupEntitySet) {
        this.questgroupEntitySet = questgroupEntitySet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionsEntity that = (QuestionsEntity) o;

        if (questionDescription != null ? !questionDescription.equals(that.questionDescription) : that.questionDescription != null)
            return false;
        return questgroupEntitySet != null ? questgroupEntitySet.equals(that.questgroupEntitySet) : that.questgroupEntitySet == null;

    }

    @Override
    public int hashCode() {
        int result = questionDescription != null ? questionDescription.hashCode() : 0;
        result = 31 * result + (questgroupEntitySet != null ? questgroupEntitySet.hashCode() : 0);
        return result;
    }
}
