package com.hms.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MedicineResponseDTO {
    private long medicineId;
    private String medicineName;
    private String medicineType;
    private int medicineStock;
}
