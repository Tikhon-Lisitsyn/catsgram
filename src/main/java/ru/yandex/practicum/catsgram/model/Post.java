package ru.yandex.practicum.catsgram.model;

import lombok.Getter;

import java.time.Instant;

@Getter
public class Post {

    private Long id;
    private final String author;
    private final Integer authorId;
    private final Instant creationDate = Instant.now();
    private String description;
    private String photoUrl;

    public Post(String author, String description, String photoUrl, Integer authorId) {
        this.author = author;
        this.description = description;
        this.photoUrl = photoUrl;
        this.authorId=authorId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}