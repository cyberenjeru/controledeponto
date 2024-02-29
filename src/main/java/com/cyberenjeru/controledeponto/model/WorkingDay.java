package com.cyberenjeru.controledeponto.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class WorkingDay {
    private Long id;
    private String description;
}
