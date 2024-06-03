package edu.kis.vh.nursery;

/**
 * Jest to stos
 * ma pojemność capacity
 */
public class DefaultCountingOutRhymer {

    private static final int empty = -1;
    private static final int capacity = 12;
    private static final int full = getCapacity() -1;
    private final int[] numbers = new int[getCapacity()];

    public static int getEmpty() {
        return empty;
    }

    public static int getCapacity() {
        return capacity;
    }

    public static int getFull() {
        return full;
    }

    public int getTotal() {
        return total;
    }

    private int total = getEmpty();

    /**
     * Dodaje in na górę stosu
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            getNumbers()[setTotal(getTotal() + 1)] = in;
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

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
