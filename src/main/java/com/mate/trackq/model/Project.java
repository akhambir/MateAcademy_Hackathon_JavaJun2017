package com.mate.trackq.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "PROJECT_NAME")
    private String pName;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<Issue> issues;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<User> users;
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}