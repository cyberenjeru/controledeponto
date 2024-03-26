package com.cyberenjeru.controledeponto.model;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AcessLevel acessLevel;
    @ManyToOne
    private WorkingDay workingDay;
    private BigDecimal tolerance;
    private LocalDateTime startJourney;
    private LocalDateTime endJourney;
}
