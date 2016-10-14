package com.cards.model;

import com.fasterxml.jackson.annotation.JsonView;

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
    private Set<GroupEntity> usersGroupEntitySet;

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
    @Column (name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonView(UsersEntity.Views.Public.class)
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonView(UsersEntity.Views.Public.class)
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonView(UsersEntity.Views.Internal.class)
    @Column(name = "password")
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
    public Set<GroupEntity> getUsersGroupEntitySet() {
        return usersGroupEntitySet;
    }

    public void setUsersGroupEntitySet(Set<GroupEntity> usersGroupEntitySet) {
        this.usersGroupEntitySet = usersGroupEntitySet;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", usersGroupEntitySet=" + usersGroupEntitySet +
                '}';
    }

    public static final class Views {
        // show only public data
        public interface Public {}

        // show public and internal data
        public interface Internal extends Public {}
    }
}
