package edu.kis.vh.nursery;

/**
 * Jest to stos
 * ma pojemność capacity
 */
public class DefaultCountingOutRhymer {

    public static final int empty = -1;
    public static final int capacity = 12;
    public static final int full = capacity-1;
    private final int[] numbers = new int[capacity];

    public int total = empty;

    /**
     * Dodaje in na górę stosu
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * sprawdza czy stos pusty
     * @return
     */
    public boolean callCheck() {
        return total == empty;
    }

    /**
     * sprawdza czy stos jest pełny
     * @return
     */
    public boolean isFull() {
        return total == full;
    }

    /**
     * zwraca liczbę elementów na stosie
     * @return
     */
    protected int peekaboo() {
        if (callCheck())
            return empty;;
        return numbers[total];
    }

    /**
     * pobiera element ze stosu
     * @return
     */
    public int countOut() {
        if (callCheck())
            return empty;
        return numbers[total--];
    }

}
