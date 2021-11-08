package jpms_primer.consumer.impl;

import java.io.PrintStream;

public class ObjectConsumerImpl implements jpms_primer.consumer.ObjectConsumer {

    private final PrintStream ps;

    public ObjectConsumerImpl(PrintStream ps) {
        this.ps = ps;
    }

    public void consume(Object obj) {
        ps.println(obj);
    }
}
