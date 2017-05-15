package spark.tweet;

import spark.dao.Entity;
import spark.user.User;

import java.time.LocalDateTime;

/**
 * Created by hein on 5/15/17.
 */
public class Tweet implements Entity{

    private Long id;
    private String text;
    private LocalDateTime timeStamp;
    private User owner;

    public Tweet(Long id, String text, User owner) {
        this.id = id;
        this.text = text;
        this.timeStamp = LocalDateTime.now();
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
