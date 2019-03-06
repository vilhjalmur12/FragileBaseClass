import java.util.concurrent.atomic.AtomicInteger;

public class IncrementerAtomic {
    private final AtomicInteger counter;

    public IncrementerAtomic() {
        counter = new AtomicInteger(0);
    }

    public int inc() {
        while(true) {
            int counterValue = getCounter();
            int newCounterValue = counterValue + 1;
            if(counter.compareAndSet(counterValue, newCounterValue)) {
                return getCounter();
            }
        }
    }

    public int getCounter() {
        return counter.get();
    }
}
