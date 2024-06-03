package edu.kis.vh.nursery;

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


    public void countIn(int in) {
        if (!isFull())
            getNumbers()[setTotal(getTotal() + 1)] = in;
    }

        public boolean callCheck() {
            return getTotal() == getEmpty();
        }
        
            public boolean isFull() {
                return getTotal() == getFull();
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return getEmpty();;
                    return getNumbers()[getTotal()];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return getEmpty();
                        return getNumbers()[setTotal(getTotal() - 1)];
                    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
