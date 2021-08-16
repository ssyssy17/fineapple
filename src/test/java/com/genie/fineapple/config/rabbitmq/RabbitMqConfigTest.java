package com.genie.fineapple.config.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RabbitMqConfigTest {

    @Autowired
    RabbitMqConfig rabbitMqConfig;

    @Test
    public void Connection() {

    }
}