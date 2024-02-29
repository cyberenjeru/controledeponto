package com.cyberenjeru.controledeponto.model;

import jakarta.persistence.OneToMany;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Locality {
    private Long id;
    private String description;
    @OneToMany
    private AcessLevel acessLevel;
}
