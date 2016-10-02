package com.cards.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "questgroup", schema = "cards")
public class QuestgroupEntity {
    private int id;
    private Set<QuestionsEntity> questionsEntitySet;
    private Set<GroupEntity> groupEntitySet;


    @Id
    @GeneratedValue
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToMany
    @JoinTable(name="questgroup_questions",
            joinColumns = @JoinColumn(name="question_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="questgroup_id", referencedColumnName="id")
    )
    public Set<QuestionsEntity> getQuestionsEntitySet() {
        return questionsEntitySet;
    }

    public void setQuestionsEntitySet(Set<QuestionsEntity> questionsEntitySet) {
        this.questionsEntitySet = questionsEntitySet;
    }

    @ManyToMany
    @JoinTable(name="questgroup_group",
            joinColumns = @JoinColumn(name="group_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="questgroup_id", referencedColumnName="id")
    )
    public Set<GroupEntity> getGroupEntitySet() {
        return groupEntitySet;
    }

    public void setGroupEntitySet(Set<GroupEntity> groupEntitySet) {
        this.groupEntitySet = groupEntitySet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestgroupEntity that = (QuestgroupEntity) o;

        if (questionsEntitySet != null ? !questionsEntitySet.equals(that.questionsEntitySet) : that.questionsEntitySet != null)
            return false;
        return groupEntitySet != null ? groupEntitySet.equals(that.groupEntitySet) : that.groupEntitySet == null;

    }

    @Override
    public int hashCode() {
        int result = questionsEntitySet != null ? questionsEntitySet.hashCode() : 0;
        result = 31 * result + (groupEntitySet != null ? groupEntitySet.hashCode() : 0);
        return result;
    }
}
