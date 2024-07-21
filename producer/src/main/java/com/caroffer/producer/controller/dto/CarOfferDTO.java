package com.caroffer.producer.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarOfferDTO {

    private String marca;
    private String modelo;
    private int anio;
    private int kilometros;
    private String telefono;
    private double oferta;

}
