package com.shiva.sb.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CONTENT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "CONTENT_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Content {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IMDB_RATING")
    float imdbRating;

}
