package com.fifahistory.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Mariano on 2/26/2016.
 */
@Entity
public class Match implements Serializable{

    private long id;

    private Result result;

    private List<User> users;

    private Date matchDate;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        throw new UnsupportedOperationException("Not supported!");
    }


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public List<User> getTeams() {
        return users;
    }

    public void setTeams(List<User> teams) {
        this.users = teams;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
}

