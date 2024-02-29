package com.cyberenjeru.controledeponto.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Company {
    private Long id;
    private String description;
    private String cnpj;
    private String adress;
    private String district;
    private String city;
    private String state;
    private String telephone;
}
