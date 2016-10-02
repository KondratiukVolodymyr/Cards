package com.cards.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "group", schema = "cards")
public class GroupEntity {
    private long id;
    private String name;
    private boolean isGeneral;
    private Set<UsersEntity> usersEntitySet;
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

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "IsGeneral")
    public boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupEntitySet")
    public Set<UsersEntity> getUsersEntitySet() {
        return usersEntitySet;
    }

    public void setUsersEntitySet(Set<UsersEntity> usersEntitySet) {
        this.usersEntitySet = usersEntitySet;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupEntitySet")
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

        GroupEntity that = (GroupEntity) o;

        if (isGeneral != that.isGeneral) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (usersEntitySet != null ? !usersEntitySet.equals(that.usersEntitySet) : that.usersEntitySet != null)
            return false;
        return questgroupEntitySet != null ? questgroupEntitySet.equals(that.questgroupEntitySet) : that.questgroupEntitySet == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isGeneral ? 1 : 0);
        result = 31 * result + (usersEntitySet != null ? usersEntitySet.hashCode() : 0);
        result = 31 * result + (questgroupEntitySet != null ? questgroupEntitySet.hashCode() : 0);
        return result;
    }
}
