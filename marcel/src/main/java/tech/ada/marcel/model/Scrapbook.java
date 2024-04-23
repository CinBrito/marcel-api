package tech.ada.marcel.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_scrapbook")
public class Scrapbook {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User user;

    @OneToMany
    private List<Content> contents;

    public Scrapbook() {}

    public Scrapbook(User user) {
        this.user = user;
        this.contents = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Content> getContents() {
        return contents;
    }
}
