package project.teamDirectory.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="team")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "number")
    @Min(value = 1, message = "Number range 1-99")
    @Max(value = 99, message = "Number range 1-99")
    private int number;

    @Column(name = "first_name")
    @NotNull(message = "is required")
    private String firstName;

    @Column(name = "last_name")
    @NotNull(message = "is required")
    private String lastName;

    @Column(name = "position")
    private String position;

    @Column(name = "yellow_cards")
    @Min(value = 0, message = "Minimum value is 0")
    private int yellowCards;

    @Column(name = "red_cards")
    @Min(value = 0, message = "Minimum value is 0")
    private int redCards;

    @Column(name = "goals")
    @Min(value = 0, message = "Minimum value is 0")
    private int goals;

    @Column(name = "assists")
    @Min(value = 0, message = "Minimum value is 0")
    private int assists;

    public Player() {
    }

    public Player(String firstName, String lastName, String position, int yellowCards, int redCards, int goals, int assists) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.goals = goals;
        this.assists = assists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player{" +
                ", number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", yellowCards=" + yellowCards +
                ", redCards=" + redCards +
                ", goals=" + goals +
                ", assists=" + assists +
                '}';
    }
}
