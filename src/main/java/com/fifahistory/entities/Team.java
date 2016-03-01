package com.fifahistory.entities;

import javax.persistence.*;

/**
 * Created by Mariano on 2/26/2016.
 */
@Entity
@Table(name = "team")
public class Team {

    private long id;

    private String teamName;

    private User user;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        throw new UnsupportedOperationException("Not supported!");
    }


    @Column(name="team_name")
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Column(name="user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
