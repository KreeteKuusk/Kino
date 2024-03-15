package org.example.kino.model;

import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Movie {
    @Id
    private Integer id;
    @Column("NAME")
    private String name;
    @Column("GENRE")
    private String genre;
    @Column("LANGUAGE")
    private String language;
    @Column("AGERESTRICTION")
    private int ageRestriction;
    @Column("STARTTIME")
    private String startTime;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", ageRestriction=" + ageRestriction +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}