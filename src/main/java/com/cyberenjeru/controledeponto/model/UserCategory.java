package com.cyberenjeru.controledeponto.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class UserCategory {
    private Long id;
    private String description;
}
