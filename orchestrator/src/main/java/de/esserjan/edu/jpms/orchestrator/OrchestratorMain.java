package de.esserjan.edu.jpms.orchestrator;

import jpms_primer.consumer.ObjectConsumer;
import jpms_primer.consumer.ObjectConsumerFactory;
import jpms_primer.producer.RandomNumberProducer;

public class OrchestratorMain {
    public static void main(String[] args) {
        RandomNumberProducer producer = RandomNumberProducer.getInstance();

        ObjectConsumerFactory consumerFactory = new ObjectConsumerFactory();
        ObjectConsumer consumer1 = consumerFactory.createConsumer();
        ObjectConsumer consumer2 = consumerFactory.createConsumer();

        for (int i = 0; i < 10; i++) {
            double product = producer.nextRandom();
            consumer1.consume(product);
            consumer2.consume(product);
        }
    }
}
