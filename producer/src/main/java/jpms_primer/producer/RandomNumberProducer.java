package jpms_primer.producer;

import jpms_primer.producer.impl.RandomNumberProducerImpl;

public interface RandomNumberProducer {
    static RandomNumberProducer getInstance() {
        return new RandomNumberProducerImpl();
    }

    double nextRandom();
}
