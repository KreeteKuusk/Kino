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



/* ÜKS VARIANT
import org.springframework.data.annotation.Id;

public record Movie(@Id Integer id, String name, String genre, String language, int ageRestriction, String startTime) { }

 */

/*  TEINE VARAINT
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "genre", nullable = false, length = 100)
    private String genre;

    @Column(name = "language", nullable = false, length = 100)
    private String language;

    @Column(name = "ageRestriction", nullable = false, length = 100)
    private int ageRestriction;

    @Column(name = "start_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime startTime;

    // default constructor, because JPA needs empty constructor
    public Movie() {
    }

    // constructor
    public Movie(String name, String genre, String language, int ageRestriction, LocalDateTime startTime) {
        this.name = name;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        this.language = language;
        this.startTime = startTime;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}

 */