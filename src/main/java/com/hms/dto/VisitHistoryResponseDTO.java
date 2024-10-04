package com.hms.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class VisitHistoryResponseDTO {
    private int id;
    private long userId;
    private String userName;
    private List<Long> medicineId;
    private Date date;
}
