package com.example.ec.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Tour {

    @Id
    @GeneratedValue
    @Column
    @Getter
    private Integer id;

    @Column
    @Getter @Setter
    private String title;

    @Column
    @Getter @Setter
    private String description;

    @Column
    @Getter @Setter
    private String blurb;

    @Column
    @Getter @Setter
    private Integer price;

    @Column
    @Getter @Setter
    private String duration;

    @Column
    @Getter @Setter
    private String bullets;

    @Column
    @Getter @Setter
    private String keywords;

    @ManyToOne
    private TourPackage tourPackage;

    @Column
    private Difficulty difficulty;

    @Column
    private Region region;

    public Tour(String title,String description, String blurb, Integer price, String duration, String bullets,
                String keywords, TourPackage tourPackage, Difficulty difficulty, Region region) {
        this.title = title;
        this.description=description;
        this.blurb=blurb;
        this.price=price;
        this.duration=duration;
        this.bullets=bullets;
        this.keywords=keywords;
        this.tourPackage=tourPackage;
        this.difficulty=difficulty;
        this.region=region;
    }

    protected Tour() {

    }



}
