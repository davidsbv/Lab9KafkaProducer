package com.caroffer.producer.model;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarOffer {

    private String marca;
    private String modelo;
    private int anio;
    private int kilometros;
    private String telefono;
    private double oferta;

}
