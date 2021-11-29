package com.shiva.sb.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@DiscriminatorValue(value = "TV_SERIES")
public class TVSeries extends Content {

    @Column(name = "TOTAL_SEASONS")
    int totalSeasons;

    @Column(name = "TOTAL_EPISODES")
    int totalEpisodes;

    @ElementCollection
    @MapKeyColumn(name = "name")
    @Column(name = "value")
    @CollectionTable(name = "SEASON_MAP", joinColumns = @JoinColumn(name = "CONTENT_ID"))
    Map<Integer, Integer> seasonMap;
}
