package metrics;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-24 17:40
 */
public class MetriceDemo01 {
    private final static MetricRegistry registry = new MetricRegistry();
    private final static Meter meter = registry.meter("tps");
    private final static Meter sizeMeter = registry.meter("volume");

    public static void main(String[] args) {
        ConsoleReporter reporter = ConsoleReporter.forRegistry(registry)
                .convertDurationsTo(TimeUnit.MINUTES)
                .convertRatesTo(TimeUnit.MINUTES).build();
        reporter.start(10, TimeUnit.SECONDS);
        for (; ; ) {
            handleRequest(new byte[ThreadLocalRandom.current().nextInt(1000)]);
        }
    }

    private static void handleRequest(byte[] request) {
        sizeMeter.mark();
        meter.mark(request.length);

        randomSleep();
    }

    private static void randomSleep() {
        try {
            TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}