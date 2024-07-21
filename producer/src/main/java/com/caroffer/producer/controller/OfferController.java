package com.caroffer.producer.controller;

import com.caroffer.producer.controller.dto.CarOfferDTO;

import com.caroffer.producer.controller.mapper.CarOfferMapper;
import com.caroffer.producer.model.CarOffer;
import com.caroffer.producer.service.OfferServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class OfferController {

    private final OfferServiceImpl offerService;
    private final CarOfferMapper carOfferMapper;

    @PostMapping("/offer")
    public ResponseEntity<?> sendOffer(@RequestBody CarOfferDTO offerDTO){

        CarOffer carOffer = carOfferMapper.toModel(offerDTO);
        log.info("Sending offer: {} ",offerDTO.toString());
        offerService.sendOffer(carOffer);

        return ResponseEntity.ok("Oferta recibida y enviada a la Kafka");
    }
}
