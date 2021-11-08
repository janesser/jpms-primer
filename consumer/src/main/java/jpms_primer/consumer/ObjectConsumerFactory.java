package jpms_primer.consumer;

import jpms_primer.consumer.impl.ObjectConsumerImpl;

import java.io.PrintStream;

public class ObjectConsumerFactory {

    public ObjectConsumer createConsumer() {
        return new ObjectConsumerImpl(new PrintStream(System.out));
    }
}
