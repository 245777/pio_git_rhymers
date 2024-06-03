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
     * Dodaje in na góre stosu
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == empty;
    }
        
    public boolean isFull() {
        return total == full;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return empty;;
        return numbers[total];
    }
            
    public int countOut() {
        if (callCheck())
            return empty;
        return numbers[total--];
    }

}
