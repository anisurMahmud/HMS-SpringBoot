package com.hms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private long id;
    private String username;
    private String sex;
    private short age;
}
