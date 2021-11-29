package com.shiva.sb.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MOVIE")
public class Movie extends Content {
    @Column(name = "DURATION")
    String duration;
}
