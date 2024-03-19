package com.cyberenjeru.controledeponto.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {
    private Long id;
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
