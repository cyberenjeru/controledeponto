package com.cyberenjeru.controledeponto.model;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private Long id;
    private UserCategory userCategory;
    private String name;
    private Company company;
    private AcessLevel acessLevel;
    private WorkingDay workingDay;
    private BigDecimal tolerance;
    private LocalDateTime startJourney;
    private LocalDateTime endJourney;
}
