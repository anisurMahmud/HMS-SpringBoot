package com.hms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
public class VisitHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Setter
    private Date date;
}
