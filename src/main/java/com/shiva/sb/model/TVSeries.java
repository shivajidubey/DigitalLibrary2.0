package com.shiva.sb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Map;

@Entity
@DiscriminatorValue(value = "TV_SERIES")
@Data
public class TVSeries extends Content {

    @Column(name = "TOTAL_SEASONS")
    private int totalSeasons;

    @Column(name = "TOTAL_EPISODES")
    private int totalEpisodes;

    @ElementCollection
    @MapKeyColumn(name = "name")
    @Column(name = "value")
    @CollectionTable(name = "SEASON_MAP", joinColumns = @JoinColumn(name = "CONTENT_ID"))
    private Map<Integer, Integer> seasonMap;
}
