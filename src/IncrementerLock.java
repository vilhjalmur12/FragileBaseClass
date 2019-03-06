public class IncrementerLock {
    private volatile int counter;

    public synchronized int inc(){
        counter ++;
        return this.counter;
    }

    public int getCounter() {
        return counter;
    }
}
