package tech.ada.marcel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_content")
public class Content {

    @Id @GeneratedValue
    private Long id;
    private String description;
    private String urlContent;

    @OneToOne
    private User user;

    public Content() {}

    public Content(String description, String urlContent) {
        this.description = description;
        this.urlContent = urlContent;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlContent() {
        return urlContent;
    }

    public void setUrlContent(String urlContent) {
        this.urlContent = urlContent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
