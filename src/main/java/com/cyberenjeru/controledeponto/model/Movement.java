package com.cyberenjeru.controledeponto.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Builder
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable {
        private Long idMoviment;
        private Long idUser;
    }
    @EmbeddedId
    private MovementId id;
    private LocalDateTime entryDate;
    private LocalDateTime leaveDate;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;
}
