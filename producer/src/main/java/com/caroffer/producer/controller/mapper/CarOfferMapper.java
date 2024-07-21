package com.caroffer.producer.controller.mapper;

import com.caroffer.producer.controller.dto.CarOfferDTO;
import com.caroffer.producer.model.CarOffer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarOfferMapper {


    CarOfferDTO toDTO(CarOffer carOffer);
    CarOffer toModel(CarOfferDTO carOfferDTO);

}
