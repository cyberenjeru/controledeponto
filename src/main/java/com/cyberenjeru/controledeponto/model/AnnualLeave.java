package com.cyberenjeru.controledeponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class AnnualLeave {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AnnualLeaveId implements Serializable {
        private Long idAnnualLeave;
        private Long idMoviment;
        private Long idUser;
    }

    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime dateWorked;
    private BigDecimal amountHours;
    private BigDecimal balanceHours;
}
