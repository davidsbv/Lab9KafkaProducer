package com.caroffer.producer.service;


import com.caroffer.producer.model.CarOffer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "car-offers";

    @Override
//    @KafkaListener(topics = "car-offers", groupId = "1")
    public void sendOffer(CarOffer offer) {

        String offerString = String.format("%s|%s|%d|%d|%s|%.2f",
                offer.getMarca(), offer.getModelo(),
                offer.getAnio(), offer.getKilometros(),
                offer.getTelefono(), offer.getOferta());

        log.info(offer.toString());
        kafkaTemplate.send(TOPIC, offerString);

    }
}
