package org.example.kino.model;

import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Watcher {
    @Id
    private Integer id;

    @Column("NAME")
    private String name;

    @Column("HISTORY")
    private Integer[] history;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getHistory() {
        return history;
    }

    public void setHistory(Integer[] history) {
        this.history = history;
    }
}