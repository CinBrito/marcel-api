package tech.ada.marcel.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_content")
public class Content {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String urlContent;
    private LocalDateTime timestamp;
    @OneToOne
    private User user;

    public Content() {}

    public Content(String description, String urlContent, User user) {
        this.description = description;
        this.urlContent = urlContent;
        this.timestamp = LocalDateTime.now();
        this.user = user;
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
