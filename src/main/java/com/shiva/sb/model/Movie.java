package com.shiva.sb.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MOVIE")
@Data
public class Movie extends Content {
    @Column(name = "DURATION")
    private String duration;
}
