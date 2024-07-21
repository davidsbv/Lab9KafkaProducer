package com.caroffer.producer.controller.mapper;

import com.caroffer.producer.controller.dto.CarOfferDTO;
import com.caroffer.producer.model.CarOffer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-21T18:02:52+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class CarOfferMapperImpl implements CarOfferMapper {

    @Override
    public CarOfferDTO toDTO(CarOffer carOffer) {
        if ( carOffer == null ) {
            return null;
        }

        CarOfferDTO.CarOfferDTOBuilder carOfferDTO = CarOfferDTO.builder();

        carOfferDTO.marca( carOffer.getMarca() );
        carOfferDTO.modelo( carOffer.getModelo() );
        carOfferDTO.anio( carOffer.getAnio() );
        carOfferDTO.kilometros( carOffer.getKilometros() );
        carOfferDTO.telefono( carOffer.getTelefono() );
        carOfferDTO.oferta( carOffer.getOferta() );

        return carOfferDTO.build();
    }

    @Override
    public CarOffer toModel(CarOfferDTO carOfferDTO) {
        if ( carOfferDTO == null ) {
            return null;
        }

        CarOffer.CarOfferBuilder carOffer = CarOffer.builder();

        carOffer.marca( carOfferDTO.getMarca() );
        carOffer.modelo( carOfferDTO.getModelo() );
        carOffer.anio( carOfferDTO.getAnio() );
        carOffer.kilometros( carOfferDTO.getKilometros() );
        carOffer.telefono( carOfferDTO.getTelefono() );
        carOffer.oferta( carOfferDTO.getOferta() );

        return carOffer.build();
    }
}
