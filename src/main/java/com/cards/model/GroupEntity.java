package com.cards.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "group", schema = "cards")
public class GroupEntity {
    private long id;
    private String name;
    private boolean isGeneral;
    private Set<QuestionsEntity> questionsEntitySet;
    private Set<UsersEntity> usersEntitySet;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "is_general")
    public boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupEntitySet")
    public Set<QuestionsEntity> getQuestionsEntitySet() {
        return questionsEntitySet;
    }

    public void setQuestionsEntitySet(Set<QuestionsEntity> questionsEntitySet) {
        this.questionsEntitySet = questionsEntitySet;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "usersGroupEntitySet")
    public Set<UsersEntity> getUsersEntitySet() {
        return usersEntitySet;
    }

    public void setUsersEntitySet(Set<UsersEntity> usersEntitySet) {
        this.usersEntitySet = usersEntitySet;
    }
}
