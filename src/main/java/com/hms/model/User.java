package com.hms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor
@Getter
@Entity
public class User {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Setter
    @NonNull
    private String name;
    @Setter
    private short age;
    @Setter
    private String sex;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<VisitHistory> visitHistory;

}
