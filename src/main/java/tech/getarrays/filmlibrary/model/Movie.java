package tech.getarrays.filmlibrary.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String directror;
    private ArrayList<Actor> actorList;
    private String yearOfProduction;
    private String filmGenre;
    @Column(nullable = false, updatable = false)
    private String filmCode;

    public Movie() {}

    public Movie(Long id, String name, String directror, ArrayList<Actor> actorList, String yearOfProduction, String filmGenre, String filmCode) {
        this.id = id;
        this.name = name;
        this.directror = directror;
        this.actorList = actorList;
        this.yearOfProduction = yearOfProduction;
        this.filmGenre = filmGenre;
        this.filmCode = filmCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectror() {
        return directror;
    }

    public void setDirectror(String directror) {
        this.directror = directror;
    }

    public ArrayList<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(ArrayList<Actor> actorList) {
        this.actorList = actorList;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmCode() {
        return filmCode;
    }

    public void setFilmCode(String filmCode) {
        this.filmCode = filmCode;
    }
}
