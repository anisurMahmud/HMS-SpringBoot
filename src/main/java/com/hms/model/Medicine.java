package com.hms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
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
