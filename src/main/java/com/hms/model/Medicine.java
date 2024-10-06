package com.hms.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Setter
    private String name;
    @Setter
    private String type;
    @Setter
    private int stock;

    @ManyToMany(mappedBy = "medicines")
    private Set<VisitHistory> visitHistory;
}
