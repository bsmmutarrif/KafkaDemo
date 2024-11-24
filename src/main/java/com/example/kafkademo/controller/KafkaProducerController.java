package com.example.kafkademo.controller;
import com.example.kafkademo.service.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class KafkaProducerController {
    private final KafkaProducerService producerService;
    public KafkaProducerController(KafkaProducerService
                                           producerService) {
        this.producerService = producerService;
    } @
            GetMapping("/send")
    public String sendMessage(@RequestParam("message") String
                                      message) {
        producerService.sendMessage("test-topic", message);
        return "Message sent to Kafka: " + message;}}