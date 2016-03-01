package com.fifahistory.entities;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mariano on 2/16/2016.
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 6787411012408357010L;

    private long id;

    private String nickname;

    private String username;

    private String password;

    private int gamesWon;

    private int gamesLost;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }


    public void setId(long id) {
        throw new UnsupportedOperationException("Not supported!");
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



    @Column(name = "games_lost")
    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }


    @Column(name = "games_won")
    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

}
