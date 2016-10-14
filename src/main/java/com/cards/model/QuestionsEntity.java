package com.cards.model;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "questions", schema = "cards")
public class QuestionsEntity {
    private long id;
    private String questionDescription;
    private Set<GroupEntity> groupEntitySet1;


    @Id
    @GeneratedValue
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonView(UsersEntity.Views.Public.class)
    @Column(name = "question_description")
    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    @ManyToMany
    @JoinTable(name = "questgroup",
            joinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id")
    )
    public Set<GroupEntity> getGroupEntitySet() {
        return groupEntitySet1;
    }

    public void setGroupEntitySet(Set<GroupEntity> groupEntitySet) {
        this.groupEntitySet1 = groupEntitySet;
    }

    public static final class Views {
        // show only public data
        public interface Public {
        }

        // show public and internal data
        public interface Internal extends UsersEntity.Views.Public {
        }
    }
}
