package jpms_primer.producer.impl;

import jpms_primer.producer.RandomNumberProducer;

import java.util.Random;

public class RandomNumberProducerImpl implements RandomNumberProducer {
    private final Random r = new Random();

    public double nextRandom() {
        return r.nextDouble();
    }
}
