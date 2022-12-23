package com.codegym.model.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor


@Getter
@Setter
public class OrderDTO {
    private Long id;
    private LocalDateTime startTime;
    private int timeRent;
    private String status;
    private Long userId;
    private Long providerId;


}
