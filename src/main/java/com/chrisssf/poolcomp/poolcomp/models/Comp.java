package com.chrisssf.poolcomp.poolcomp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="comps")
public class Comp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private LocalDate date;

    @JsonIgnoreProperties(value="comps")
    @ManyToMany
    @JoinTable(
            name="players_comps",
            joinColumns = {@JoinColumn(
                    name="comp_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = { @JoinColumn(
                    name="player_id",
                    nullable = false,
                    updatable = false
            )}
    )
//    @Column(name="players")
    private List<Player> players;
//
////    @JsonIgnoreProperties(value="comps")
////    @ManyToMany
////    @JoinTable(
////            name="players_wins",
////            joinColumns = {@JoinColumn(
////                    name="comp_id",
////                    nullable = false,
////                    updatable = false
////            )},
////            inverseJoinColumns = { @JoinColumn(
////                    name="player_id",
////                    nullable = false,
////                    updatable = false
////            )}
////    )
//    @Column(name="winner")
//    private List<Player> winner;
//
//    @Column(name="runner_up")
//    private List<Player> runnerUp;
//
//    @Column(name="semi")
//    private List<Player> semi;
//
//    @Column(name="quarter")
//    private List<Player> quarter;
//
//    @Column(name="last")
//    private List<Player> last;
//
//    @Column(name="group")
//    private List<Player> group;
//
    @Column(name="winner_prize_money")
    private Integer winnerPrizeMoney;

    @Column(name="runner_up_prize_money")
    private Integer runnerUpPrizeMoney;

    @Column(name="semi_prize_money")
    private Integer semiPrizeMoney;

    @Column(name="quarter_prize_money")
    private Integer quarterPrizeMoney;

//    @Column(name="players_racks_won_alphabetically")
//    private List<Integer> playersRacksWonAlphabetically;

//    @Column(name="players_racks_lost_alphabetically")
//    private List<Integer> playersRacksLostAlphabetically;


//    public Comp(List<Player> players, List<Player> winner, List<Player> runnerUp, List<Player> semi, List<Player> quarter, List<Player> last, List<Player> group, Integer winnerPrizeMoney, Integer runnerUpPrizeMoney, Integer semiPrizeMoney, Integer quarterPrizeMoney, List<Integer> playersRacksWonAlphabetically, List<Integer> playersRacksLostAlphabetically) {
    public Comp(List<Player> players, Integer winnerPrizeMoney, Integer runnerUpPrizeMoney, Integer semiPrizeMoney, Integer quarterPrizeMoney){
        this.date = LocalDate.now();
        this.players = players;
//        this.winner = winner;
//        this.runnerUp = runnerUp;
//        this.semi = semi;
//        this.quarter = quarter;
//        this.last = last;
//        this.group = group;
        this.winnerPrizeMoney = winnerPrizeMoney;
        this.runnerUpPrizeMoney = runnerUpPrizeMoney;
        this.semiPrizeMoney = semiPrizeMoney;
        this.quarterPrizeMoney = quarterPrizeMoney;
//        this.playersRacksWonAlphabetically = playersRacksWonAlphabetically;
//        this.playersRacksLostAlphabetically = playersRacksLostAlphabetically;
    }

    public Comp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
//
//    public List<Player> getWinner() {
//        return winner;
//    }
//
//    public void setWinner(List<Player> winner) {
//        this.winner = winner;
//    }
//
//    public List<Player> getRunnerUp() {
//        return runnerUp;
//    }
//
//    public void setRunnerUp(List<Player> runnerUp) {
//        this.runnerUp = runnerUp;
//    }
//
//    public List<Player> getSemi() {
//        return semi;
//    }
//
//    public void setSemi(List<Player> semi) {
//        this.semi = semi;
//    }
//
//    public List<Player> getQuarter() {
//        return quarter;
//    }
//
//    public void setQuarter(List<Player> quarter) {
//        this.quarter = quarter;
//    }
//
//    public List<Player> getLast() {
//        return last;
//    }
//
//    public void setLast(List<Player> last) {
//        this.last = last;
//    }
//
//    public List<Player> getGroup() {
//        return group;
//    }
//
//    public void setGroup(List<Player> group) {
//        this.group = group;
//    }
//
    public Integer getWinnerPrizeMoney() {
        return winnerPrizeMoney;
    }

    public void setWinnerPrizeMoney(Integer winnerPrizeMoney) {
        this.winnerPrizeMoney = winnerPrizeMoney;
    }

    public Integer getRunnerUpPrizeMoney() {
        return runnerUpPrizeMoney;
    }

    public void setRunnerUpPrizeMoney(Integer runnerUpPrizeMoney) {
        this.runnerUpPrizeMoney = runnerUpPrizeMoney;
    }

    public Integer getSemiPrizeMoney() {
        return semiPrizeMoney;
    }

    public void setSemiPrizeMoney(Integer semiPrizeMoney) {
        this.semiPrizeMoney = semiPrizeMoney;
    }

    public Integer getQuarterPrizeMoney() {
        return quarterPrizeMoney;
    }

    public void setQuarterPrizeMoney(Integer quarterPrizeMoney) {
        this.quarterPrizeMoney = quarterPrizeMoney;
    }

//    public List<Integer> getPlayersRacksWonAlphabetically() {
//        return playersRacksWonAlphabetically;
//    }
//
//    public void setPlayersRacksWonAlphabetically(List<Integer> playersRacksWonAlphabetically) {
//        this.playersRacksWonAlphabetically = playersRacksWonAlphabetically;
//    }

//    public List<Integer> getPlayersRacksLostAlphabetically() {
//        return playersRacksLostAlphabetically;
//    }
//
//    public void setPlayersRacksLostAlphabetically(List<Integer> playersRacksLostAlphabetically) {
//        this.playersRacksLostAlphabetically = playersRacksLostAlphabetically;
//    }
}
