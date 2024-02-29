package com.cyberenjeru.controledeponto.model;

import jakarta.persistence.EmbeddedId;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class AcessLevel {
    private Long id;
    private String description;
}
