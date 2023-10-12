package com.morenike.springboot;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class WikimediaProducer {
    private static final Logger LOGGER = Logger.getLogger(WikimediaProducer.class.getName());

    private KafkaTemplate<String, String> kafkaTemplate;

    public WikimediaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

}
