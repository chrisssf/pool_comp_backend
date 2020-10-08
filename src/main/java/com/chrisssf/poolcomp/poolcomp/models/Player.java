package com.chrisssf.poolcomp.poolcomp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nick_name")
    private String nickName;

    @Column(name="prize_money")
    private Integer prizeMoney;

    @Column(name="racks_won")
    private Integer racksWon;

    @Column(name="racks_lost")
    private Integer racksLost;

    @Column(name="knockout_matches_won")
    private Integer knockoutMatchesWon;

    @Column(name="knockout_matches_lost")
    private Integer knockoutMatchesLost;

    @JsonIgnoreProperties(value="players")
    @ManyToMany
    @JoinTable(
            name="players_comps",
            joinColumns = {@JoinColumn(
                    name="player_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = { @JoinColumn(
                    name="comp_id",
                    nullable = false,
                    updatable = false
            )}
    )
//    @Column(name="comps")
    private List<Comp> comps;

//    @JsonIgnoreProperties(value="players")
//    @ManyToMany
//    @JoinTable(
//            name="players_wins",
//            joinColumns = {@JoinColumn(
//                    name="player_id",
//                    nullable = false,
//                    updatable = false
//            )},
//            inverseJoinColumns = { @JoinColumn(
//                    name="comp_id",
//                    nullable = false,
//                    updatable = false
//            )}
//    )
//    @Column(name="winner")
//    private List<Comp> winner;
//
//    @Column(name="runner_up")
//    private List<Comp> runnerUp;
//
//    @Column(name="semi")
//    private List<Comp> semi;
//
//    @Column(name="quarter")
//    private List<Comp> quarter;
//
//    @Column(name="last_16")
//    private List<Comp> last16;
//
//    @Column(name="group")
//    private List<Comp> group;


    public Player(String firstName, String lastName, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.prizeMoney = 0;
        this.racksWon = 0;
        this.racksLost = 0;
        this.knockoutMatchesWon = 0;
        this.knockoutMatchesLost = 0;
        this.comps = new ArrayList<Comp>();
//        this.winner = new ArrayList<Comp>();
//        this.runnerUp = new ArrayList<Comp>();
//        this.semi = new ArrayList<Comp>();
//        this.quarter = new ArrayList<Comp>();
//        this.last16 = new ArrayList<Comp>();
//        this.group = new ArrayList<Comp>();
    }

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(Integer prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public Integer getRacksWon() {
        return racksWon;
    }

    public void setRacksWon(Integer racksWon) {
        this.racksWon = racksWon;
    }

    public Integer getRacksLost() {
        return racksLost;
    }

    public void setRacksLost(Integer racksLost) {
        this.racksLost = racksLost;
    }

    public Integer getKnockoutMatchesWon() {
        return knockoutMatchesWon;
    }

    public void setKnockoutMatchesWon(Integer knockoutMatchesWon) {
        this.knockoutMatchesWon = knockoutMatchesWon;
    }

    public Integer getKnockoutMatchesLost() {
        return knockoutMatchesLost;
    }

    public void setKnockoutMatchesLost(Integer knockoutMatchesLost) {
        this.knockoutMatchesLost = knockoutMatchesLost;
    }

    public List<Comp> getComps() {
        return comps;
    }

    public void setComps(List<Comp> comps) {
        this.comps = comps;
    }
//
//    public List<Comp> getWinner() {
//        return winner;
//    }
//
//    public void setWinner(List<Comp> winner) {
//        this.winner = winner;
//    }
//
//    public List<Comp> getRunnerUp() {
//        return runnerUp;
//    }
//
//    public void setRunnerUp(List<Comp> runnerUp) {
//        this.runnerUp = runnerUp;
//    }
//
//    public List<Comp> getSemi() {
//        return semi;
//    }
//
//    public void setSemi(List<Comp> semi) {
//        this.semi = semi;
//    }
//
//    public List<Comp> getQuarter() {
//        return quarter;
//    }
//
//    public void setQuarter(List<Comp> quarter) {
//        this.quarter = quarter;
//    }
//
//    public List<Comp> getLast16() {
//        return last16;
//    }
//
//    public void setLast16(List<Comp> last16) {
//        this.last16 = last16;
//    }
//
//    public List<Comp> getGroup() {
//        return group;
//    }
//
//    public void setGroup(List<Comp> group) {
//        this.group = group;
//    }
}
