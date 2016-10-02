package com.cards.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users", schema = "cards")
public class UsersEntity {
    private long id;
    private String userName;
    private String surname;
    private String email;
    private String password;
    private Set<GroupEntity> groupEntitySet;

    @Id
    @GeneratedValue
    @Column(name = "Id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToMany
    @JoinTable(name="users_group",
            joinColumns = @JoinColumn(name="user_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="group_id", referencedColumnName="id")
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

        UsersEntity that = (UsersEntity) o;

        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        return groupEntitySet != null ? groupEntitySet.equals(that.groupEntitySet) : that.groupEntitySet == null;

    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (groupEntitySet != null ? groupEntitySet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", groupEntitySet=" + groupEntitySet +
                '}';
    }
}
