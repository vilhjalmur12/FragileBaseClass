public class IncrementerAtomicInher extends IncrementerAtomic {
    public int inc2() {
        int tmp;
        tmp = inc();
        tmp = inc();
        return getCounter();
    }
}
